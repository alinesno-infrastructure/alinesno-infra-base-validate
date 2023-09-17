package com.alinesno.infra.base.validate.service;

import com.alinesno.infra.base.validate.api.dto.CaptchaResponse;

/**
 * 验证码服务接口
 */
public interface ICaptchaService {

    /**
     * 生成验证码图片
     *
     * @return 验证码响应对象
     */
    CaptchaResponse generateCaptchaImage();

    /**
     * 验证验证码
     *
     * @param captchaId    验证码ID
     * @param captchaValue 用户输入的验证码值
     * @return 验证结果，true 表示验证通过，false 表示验证失败
     */
    boolean verifyCaptcha(String captchaId, String captchaValue);

}
