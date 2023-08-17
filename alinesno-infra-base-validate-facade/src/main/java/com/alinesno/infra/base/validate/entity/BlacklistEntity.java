package com.alinesno.infra.base.validate.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 功能名：【请填写功能名称】
 * 数据表：blacklist
 * 表备注：
 * 
 * blacklistEntity 实体类
 * 
 * <p>字段注释：</p>
 * <ul>
 *   <li>ip：IP限制</li>
 *   <li>remark：备注</li>
 *   <li>appCode：应用代码</li>
 * </ul>
 * 
 * <p>使用 MyBatis-Plus 注解进行字段映射：</p>
 * <ul>
 *   <li>@TableName("blacklist")：对应数据库表名</li>
 *   <li>@TableField("ip")：对应数据库字段名</li>
 *   <li>@TableField("remark")：对应数据库字段名</li>
 *   <li>@TableField("app_code")：对应数据库字段名</li>
 * </ul>
 * 
 * <p>使用 EasyPoi 注解进行 Excel 导入导出：</p>
 * <ul>
 *   <li>@Excel(name = "IP限制")：对应 Excel 表头名称</li>
 *   <li>@Excel(name = "备注")：对应 Excel 表头名称</li>
 *   <li>@Excel(name = "应用代码")：对应 Excel 表头名称</li>
 * </ul>
 * 
 * <p>继承自 BaseEntity，包含基础字段和方法。</p>
 * 
 * <p>注意：</p>
 * <ul>
 *   <li>@TableField 不允许重复</li>
 *   <li>@TableField 没有 length 属性</li>
 *   <li>InfraBaseEntity 的路径为 com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity</li>
 * </ul>
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("blacklist")
public class BlacklistEntity extends InfraBaseEntity {

    /**
     * IP限制
     */
    @Excel(name = "IP限制")
    @TableField("ip")
    private String ip;
    
    /**
     * 备注
     */
    @Excel(name = "备注")
    @TableField("remark")
    private String remark;

    /**
     * 应用代码
     */
    @Excel(name = "应用代码")
    @TableField("app_code")
    private String appCode;

    // getter and setter methods

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
}
