package com.alinesno.infra.base.validate.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 功能名：【请填写功能名称】
 * 数据表：request_record
 * 表备注：
 * 
 * 实体类用于映射数据库表request_record的字段和属性
 * 
 * 注解说明：
 * - @TableName：指定数据库表名
 * - @TableField：指定数据库字段名
 * 
 * 字段说明：
 * - validateCode：登陆验证码
 * - applicationCode：应用代码
 * - loginSrc：登陆渠道
 * - signOutTime：退出时间
 * - loginBrowser：登陆浏览器
 * - loginRemark：登陆备注
 * - getResult：登陆结果
 * - queryParams：请求参数
 * - resultCode：结果代码
 * - ip：IP地址
 * 
 * 注意事项：
 * - @TableField不允许重复
 * - @TableField没有length属性
 * - 类的字段需要添加中文注释信息
 * - 类需要添加详细的注释信息
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("request_record")
public class RequestRecordEntity extends InfraBaseEntity {

    // 登陆验证码
    @TableField("validate_code")
    private String validateCode;
    
    // 应用代码
    @TableField("application_code")
    private String applicationCode;
    
    // 登陆渠道
    @TableField("login_src")
    private String loginSrc;
    
    // 退出时间
    @TableField("sign_out_time")
    private Date signOutTime;
    
    // 登陆浏览器
    @TableField("login_browser")
    private String loginBrowser;
    
    // 登陆备注
    @TableField("login_remark")
    private String loginRemark;
    
    // 登陆结果
    @TableField("get_result")
    private String getResult;
    
    // 请求参数
    @TableField("query_params")
    private String queryParams;
    
    // 结果代码
    @TableField("result_code")
    private Integer resultCode;
    
    // IP地址
    @TableField("ip")
    private String ip;

    // getter and setter methods
    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String getLoginSrc() {
        return loginSrc;
    }

    public void setLoginSrc(String loginSrc) {
        this.loginSrc = loginSrc;
    }

    public Date getSignOutTime() {
        return signOutTime;
    }

    public void setSignOutTime(Date signOutTime) {
        this.signOutTime = signOutTime;
    }

    public String getLoginBrowser() {
        return loginBrowser;
    }

    public void setLoginBrowser(String loginBrowser) {
        this.loginBrowser = loginBrowser;
    }

    public String getLoginRemark() {
        return loginRemark;
    }

    public void setLoginRemark(String loginRemark) {
        this.loginRemark = loginRemark;
    }

    public String getGetResult() {
        return getResult;
    }

    public void setGetResult(String getResult) {
        this.getResult = getResult;
    }

    public String getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(String queryParams) {
        this.queryParams = queryParams;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
