package com.alinesno.infra.base.validate.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.time.LocalDateTime;

/**
 * 验证记录表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("otp_verification_record")
@Data
public class OtpVerificationRecordEntity {
    /**
     * 用户ID（User ID）：关联到用户表中的用户ID。
     */
    @TableId(value = "user_id", type = IdType.AUTO)
	@ColumnType(length=50)
	@ColumnComment("用户ID（User")
	@TableField("user_id")
    private Long userId;

    /**
     * OTP代码（OTP Code）：用户输入的 OTP 代码。
     */
    @TableField("otp_code")
	@ColumnType(length=6)
	@ColumnComment("OTP代码（OTP")
    private String otpCode;

    /**
     * 创建时间（Creation Time）：生成 OTP 代码的时间戳。
     */
    @TableField("creation_time")
	@ColumnType(length=19)
	@ColumnComment("创建时间（Creation")
    private LocalDateTime creationTime;
}
