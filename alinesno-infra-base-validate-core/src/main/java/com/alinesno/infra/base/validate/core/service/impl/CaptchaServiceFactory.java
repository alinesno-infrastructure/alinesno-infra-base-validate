package com.alinesno.infra.base.validate.core.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ServiceLoader;

import com.alinesno.infra.base.validate.core.model.common.Const;
import com.alinesno.infra.base.validate.core.service.CaptchaCacheService;
import com.alinesno.infra.base.validate.core.service.CaptchaService;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by raodeming on 2020/5/26.
 */
@Slf4j
public class CaptchaServiceFactory {

    public static CaptchaService getInstance(Properties config) {

        //先把所有CaptchaService初始化，通过init方法，实例字体等，add by lide1202@hotmail.com
        String captchaType = config.getProperty(Const.CAPTCHA_TYPE, "default");
        CaptchaService ret = instances.get(captchaType);

        if (ret == null) {
            throw new RuntimeException("unsupported-[captcha.type]=" + captchaType);
        }
        ret.init(config);
        return ret;
    }

    public static CaptchaCacheService getCache(String cacheType) {
        return cacheService.get(cacheType);
    }

    public volatile static Map<String, CaptchaService> instances = new HashMap();
    public volatile static Map<String, CaptchaCacheService> cacheService = new HashMap();

    static {
        ServiceLoader<CaptchaCacheService> cacheServices = ServiceLoader.load(CaptchaCacheService.class);
        for (CaptchaCacheService item : cacheServices) {
            cacheService.put(item.type(), item);
        }
        cacheService.put("redis",new CaptchaCacheServiceRedisImpl());

        log.info("supported-captchaCache-service:{}", cacheService.keySet().toString());

        ServiceLoader<CaptchaService> services = ServiceLoader.load(CaptchaService.class);
        for (CaptchaService item : services) {
            instances.put(item.captchaType(), item);
        }

        log.info("supported-captchaTypes-service:{}", instances.keySet().toString());
    }
}
