package com.alinesno.infra.base.validate.service;

/**
 * TOTP服务接口
 */
public interface ITOTPService {
    /**
     * 绑定TOTP
     *
     * @param userId     用户ID
     * @param secretKey  密钥
     */
    void bindTOTP(Long userId, String secretKey);

    /**
     * 验证TOTP
     *
     * @param userId 用户ID
     * @param code   验证码
     * @return 验证结果
     */
    boolean validateTOTP(Long userId, String code);
}
