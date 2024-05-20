package com.alinesno.infra.base.validate.core.config;

import com.alinesno.infra.base.validate.core.properties.AjCaptchaProperties;
import com.alinesno.infra.base.validate.core.service.CaptchaCacheService;
import com.alinesno.infra.base.validate.core.service.impl.CaptchaServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 存储策略自动配置.
 *
 */
@Configuration
public class AjCaptchaStorageAutoConfiguration {

    @Bean(name = "AjCaptchaCacheService")
    public CaptchaCacheService captchaCacheService(AjCaptchaProperties ajCaptchaProperties){
        //缓存类型redis/local/....
        return CaptchaServiceFactory.getCache(ajCaptchaProperties.getCacheType().name());
    }
}
