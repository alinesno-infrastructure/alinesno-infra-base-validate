package com.alinesno.infra.base.validate.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 用户关联信息表
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("otp_user")
public class OtpUserEntity {
    /**
     * 用户ID（User ID）：唯一标识用户的主键。
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 密钥（Secret Key）：用于生成 OTP 的秘密密钥（建议使用随机生成的字符串）。
     */
    @TableField("secret_key")
    private String secretKey;

    // Getters and Setters

    /**
     * 获取用户ID（User ID）。
     *
     * @return 用户ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置用户ID（User ID）。
     *
     * @param id 用户ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取密钥（Secret Key）。
     *
     * @return 密钥
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * 设置密钥（Secret Key）。
     *
     * @param secretKey 密钥
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
