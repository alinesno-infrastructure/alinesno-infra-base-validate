package com.alinesno.infra.base.validate.api.dto;

import lombok.Data;

/**
 * 绑定TOTP请求类
 * 用于封装绑定TOTP的请求数据
 * 包含用户ID和密钥信息
 */
@Data
public class BindTOTPRequest {

    private Long userId;      // 用户ID
    private String secretKey; // 密钥

    // Getters and Setters
}
