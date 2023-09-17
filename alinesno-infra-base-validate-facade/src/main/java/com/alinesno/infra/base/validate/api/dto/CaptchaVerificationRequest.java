package com.alinesno.infra.base.validate.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 验证码验证请求类
 * 用于封装验证码验证的请求数据
 * 包含验证码ID和验证码值
 */
@Data
@AllArgsConstructor
public class CaptchaVerificationRequest {

    private String captchaId;     // 验证码ID
    private String captchaValue;  // 验证码值
}
