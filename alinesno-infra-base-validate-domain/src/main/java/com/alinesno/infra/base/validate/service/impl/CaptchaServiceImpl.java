package com.alinesno.infra.base.validate.service.impl;

import com.alinesno.infra.base.validate.api.dto.CaptchaResponse;
import com.alinesno.infra.base.validate.entity.CaptchaRecordEntity;
import com.alinesno.infra.base.validate.mapper.CaptchaMapper;
import com.alinesno.infra.base.validate.service.ICaptchaService;
import com.google.code.kaptcha.Producer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 这是一个验证码服务实现类
 * 该类用于生成和验证验证码
 *
 * 作者：luoxiaodong
 * 版本：1.0.0
 */
@Service
public class CaptchaServiceImpl implements ICaptchaService {

    private final CaptchaMapper captchaRepository;
    private final RedisTemplate<String, String> redisTemplate;
    private final Producer kaptcha;

    /**
     * 构造方法
     *
     * @param captchaRepository 验证码记录的数据库操作对象
     * @param redisTemplate Redis操作模板
     * @param kaptcha 验证码生成器
     */
    public CaptchaServiceImpl(CaptchaMapper captchaRepository,
                              RedisTemplate<String, String> redisTemplate,
                              Producer kaptcha) {

        this.captchaRepository = captchaRepository;
        this.redisTemplate = redisTemplate;
        this.kaptcha = kaptcha;
    }

    /**
     * 生成验证码图片和验证码ID
     *
     * @return 验证码响应对象，包含验证码ID和验证码图片
     */
    @Override
    public CaptchaResponse generateCaptchaImage() {

        String captchaId = UUID.randomUUID().toString();
        String captchaValue = kaptcha.createText();
        BufferedImage captchaImage = kaptcha.createImage(captchaValue);

        // 保存验证码到Redis
        redisTemplate.opsForValue().set(captchaId, captchaValue, 1, TimeUnit.MINUTES);

        // 保存验证码记录到数据库
        CaptchaRecordEntity record = new CaptchaRecordEntity(captchaValue);
        record.setFieldId(captchaId);
        record.setAddTime(new Date());

        captchaRepository.insert(record);

        return new CaptchaResponse(captchaId, captchaImage);
    }

    /**
     * 验证验证码是否正确
     *
     * @param captchaId 验证码ID
     * @param captchaValue 用户输入的验证码值
     * @return 验证结果，true表示验证成功，false表示验证失败
     */
    @Override
    public boolean verifyCaptcha(String captchaId, String captchaValue) {
        String value = redisTemplate.opsForValue().get(captchaId);
        if (value != null && value.equals(captchaValue)) {
            // 验证成功，删除验证码
            redisTemplate.delete(captchaId);
            return true;
        } else {
            return false;
        }
    }
}
