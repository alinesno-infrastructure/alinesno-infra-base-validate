package com.alinesno.infra.base.validate.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 * 验证记录表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("otp_verification_record")
public class OtpVerificationRecordEntity extends BaseEntity {
    /**
     * 用户ID（User ID）：关联到用户表中的用户ID。
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * OTP代码（OTP Code）：用户输入的 OTP 代码。
     */
    @TableField("otp_code")
    private String otpCode;

    /**
     * 创建时间（Creation Time）：生成 OTP 代码的时间戳。
     */
    @TableField("creation_time")
    private LocalDateTime creationTime;

    // Getters and Setters

    /**
     * 获取用户ID（User ID）。
     *
     * @return 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID（User ID）。
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取OTP代码（OTP Code）。
     *
     * @return OTP代码
     */
    public String getOtpCode() {
        return otpCode;
    }

    /**
     * 设置OTP代码（OTP Code）。
     *
     * @param otpCode OTP代码
     */
    public void setOtpCode(String otpCode) {
        this.otpCode = otpCode;
    }

    /**
     * 获取创建时间（Creation Time）。
     *
     * @return 创建时间
     */
    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    /**
     * 设置创建时间（Creation Time）。
     *
     * @param creationTime 创建时间
     */
    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }
}
