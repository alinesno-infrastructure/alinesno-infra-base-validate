package com.alinesno.infra.base.validate.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * TOTP验证记录实体类
 * 该实体类继承自基础实体类 InfraBaseEntity
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("totp_record")
public class TOTPRecordEntity extends InfraBaseEntity {

    /**
     * 用户ID
     */
    @TableField
	@ColumnType(length=50)
	@ColumnComment("用户ID")
    private long userId;

    /**
     * 验证码
     */
    @TableField
	@ColumnType(length=255)
	@ColumnComment("验证码")
    private String code;

    /**
     * 是否有效
     */
    @TableField
	@ColumnType(length=1)
	@ColumnComment("是否有效")
    private boolean isValid;
}
