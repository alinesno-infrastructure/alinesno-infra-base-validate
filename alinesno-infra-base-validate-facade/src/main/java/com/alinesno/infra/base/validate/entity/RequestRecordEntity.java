package com.alinesno.infra.base.validate.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import java.util.Date;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

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
@Data
public class RequestRecordEntity extends InfraBaseEntity {

    // 登陆验证码
    @TableField("validate_code")
	@ColumnType(length=6)
	@ColumnComment("登陆验证码")
    private String validateCode;
    
    // 应用代码
    @TableField("application_code")
	@ColumnType(length=50)
	@ColumnComment("应用代码")
    private String applicationCode;
    
    // 登陆渠道
    @TableField("login_src")
	@ColumnType(length=50)
	@ColumnComment("登录来源")
    private String loginSrc;
    
    // 退出时间
    @TableField("sign_out_time")
	@ColumnType(length=8)
	@ColumnComment("签退时间")
    private Date signOutTime;
    
    // 登陆浏览器
    @TableField("login_browser")
	@ColumnType(length=255)
	@ColumnComment("登录浏览器")
    private String loginBrowser;
    
    // 登陆备注
    @TableField("login_remark")
	@ColumnType(length=255)
	@ColumnComment("登录备注")
    private String loginRemark;
    
    // 登陆结果
    @TableField("get_result")
	@ColumnType(length=255)
	@ColumnComment("无法确定")
    private String getResult;
    
    // 请求参数
    @TableField("query_params")
	@ColumnType(length=255)
	@ColumnComment("查询参数")
    private String queryParams;
    
    // 结果代码
    @TableField("result_code")
	@ColumnType(length=3)
	@ColumnComment("结果代码")
    private Integer resultCode;
    
    // IP地址
    @TableField("ip")
	@ColumnType(length=15)
	@ColumnComment("IP地址")
    private String ip;
}
