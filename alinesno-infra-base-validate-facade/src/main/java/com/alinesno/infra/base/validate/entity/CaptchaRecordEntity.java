package com.alinesno.infra.base.validate.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 验证码记录实体类
 * 该实体类继承自基础实体类 InfraBaseEntity
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@TableName("captcha_record")
public class CaptchaRecordEntity extends InfraBaseEntity {

    /**
     * 验证码值
     */
    @TableField("captcha_value")
	@ColumnType(length=6)
	@ColumnComment("验证码值")
    private String captchaValue;
}
