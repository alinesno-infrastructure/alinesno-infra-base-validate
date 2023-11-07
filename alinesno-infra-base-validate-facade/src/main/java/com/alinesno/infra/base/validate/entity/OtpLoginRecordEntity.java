package com.alinesno.infra.base.validate.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 *
 * 用户登陆记录表
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("otp_login_record")
public class OtpLoginRecordEntity extends BaseEntity {
    /**
     * 用户ID（User ID）：关联到用户表中的用户ID。
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 登录时间（Login Time）：用户进行登录操作的时间戳。
     */
    @TableField("login_time")
    private LocalDateTime loginTime;

    /**
     * 登录结果（Login Result）：记录登录操作的结果，如成功或失败。
     */
    @TableField("login_result")
    private String loginResult;

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
     * 获取登录时间（Login Time）。
     *
     * @return 登录时间
     */
    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间（Login Time）。
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取登录结果（Login Result）。
     *
     * @return 登录结果
     */
    public String getLoginResult() {
        return loginResult;
    }

    /**
     * 设置登录结果（Login Result）。
     *
     * @param loginResult 登录结果
     */
    public void setLoginResult(String loginResult) {
        this.loginResult = loginResult;
    }
}
