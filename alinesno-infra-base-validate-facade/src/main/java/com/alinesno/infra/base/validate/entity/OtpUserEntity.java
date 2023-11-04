package com.alinesno.infra.base.validate.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class OtpUserEntity {
    /**
     * 用户ID（User ID）：唯一标识用户的主键。
     */
    @TableId(value = "id", type = IdType.AUTO)
	@ColumnType(length=10)
	@ColumnComment("用户ID（User")
	@TableField("id")
    private Long id;

    /**
     * 密钥（Secret Key）：用于生成 OTP 的秘密密钥（建议使用随机生成的字符串）。
     */
    @TableField("secret_key")
	@ColumnType(length=32)
	@ColumnComment("密钥（Secret")
    private String secretKey;
}
