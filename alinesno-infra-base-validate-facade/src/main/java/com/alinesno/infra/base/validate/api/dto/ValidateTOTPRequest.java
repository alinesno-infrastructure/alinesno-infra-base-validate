package com.alinesno.infra.base.validate.api.dto;

import lombok.Data;

/**
 * 验证TOTP请求类
 * 用于封装验证TOTP的请求数据
 * 包含用户ID和验证码
 */
@Data
public class ValidateTOTPRequest {
    private Long userId;   // 用户ID
    private String code;   // 验证码
}