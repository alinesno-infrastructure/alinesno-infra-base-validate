package com.alinesno.infra.base.validate.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户关联信息表
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("otp_user")
public class OtpUserEntity extends BaseEntity {
    /**
     * 用户ID（User ID）：唯一标识用户的主键。
     */
//    @TableId(value = "id", type = IdType.AUTO)
//    private Long id;

    /**
     * 密钥（Secret Key）：用于生成 OTP 的秘密密钥（建议使用随机生成的字符串）。
     */
    @TableField("secret_key")
    private String secretKey;

}
