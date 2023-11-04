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
 *
 * 用户登陆记录表
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("otp_login_record")
@Data
public class OtpLoginRecordEntity {
    /**
     * 用户ID（User ID）：关联到用户表中的用户ID。
     */
    @TableId(value = "user_id", type = IdType.AUTO)
	@ColumnType(length=50)
	@ColumnComment("用户ID（User")
	@TableField("user_id")
    private Long userId;

    /**
     * 登录时间（Login Time）：用户进行登录操作的时间戳。
     */
    @TableField("login_time")
	@ColumnType(length=19)
	@ColumnComment("登录时间（Login")
    private LocalDateTime loginTime;

    /**
     * 登录结果（Login Result）：记录登录操作的结果，如成功或失败。
     */
    @TableField("login_result")
	@ColumnType(length=1)
	@ColumnComment("登录结果（Login")
    private String loginResult;
}
