package com.alinesno.infra.base.validate.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 数据表：application
 *
 * ApplicationEntity 实体类
 * 
 * <p>字段注释：</p>
 * <ul>
 *   <li>name：名称</li>
 *   <li>applicationCode：应用编码</li>
 *   <li>maxFileSize：最大文件大小</li>
 *   <li>fileType：文件类型</li>
 *   <li>apiKey：API密钥</li>
 *   <li>maxUploadCount：最大上传次数</li>
 *   <li>maxDownloadCount：最大下载次数</li>
 *   <li>companyName：公司名称</li>
 *   <li>channelIds：渠道IDs</li>
 *   <li>appCode：应用编码</li>
 *   <li>requestCount：请求次数</li>
 *   <li>validateCount：验证次数</li>
 * </ul>
 * 
 * <p>使用 MyBatis-Plus 注解进行字段映射：</p>
 * <ul>
 *   <li>@TableName("application")：对应数据库表名</li>
 *   <li>@TableField("name")：对应数据库字段名</li>
 * </ul>
 * 
 * <p>使用 EasyPoi 注解进行 Excel 导入导出：</p>
 * <ul>
 *   <li>@Excel(name = "name")：对应 Excel 表头名称</li>
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
@TableName("application")
@Data
public class ApplicationEntity extends InfraBaseEntity {

    /**
     * 名称
     */
    @Excel(name = "名称")
    @TableField("name")
	@ColumnType(length=255)
	@ColumnComment("名称")
    private String name;
    
    /**
     * 应用编码
     */
    @Excel(name = "应用编码")
    @TableField("application_code")
	@ColumnType(length=50)
	@ColumnComment("应用编码")
    private String applicationCode;
    
    /**
     * 最大文件大小
     */
    @Excel(name = "最大文件大小")
    @TableField("max_file_size")
	@ColumnType(length=4)
	@ColumnComment("最大文件大小")
    private Long maxFileSize;
    
    /**
     * 文件类型
     */
    @Excel(name = "文件类型")
    @TableField("file_type")
	@ColumnType(length=20)
	@ColumnComment("文件类型")
    private String fileType;
    
    /**
     * API密钥
     */
    @Excel(name = "API密钥")
    @TableField("api_key")
	@ColumnType(length=32)
	@ColumnComment("API密钥")
    private String apiKey;
    
    /**
     * 最大上传次数
     */
    @Excel(name = "最大上传次数")
    @TableField("max_upload_count")
	@ColumnType(length=255)
	@ColumnComment("最大上传次数")
    private Long maxUploadCount;
    
    /**
     * 最大下载次数
     */
    @Excel(name = "最大下载次数")
    @TableField("max_download_count")
	@ColumnType(length=10)
	@ColumnComment("最大下载次数")
    private Long maxDownloadCount;
    
    /**
     * 公司名称
     */
    @Excel(name = "公司名称")
    @TableField("company_name")
	@ColumnType(length=50)
	@ColumnComment("公司名称")
    private String companyName;
    
    /**
     * 渠道IDs
     */
    @Excel(name = "渠道IDs")
    @TableField("channel_ids")
	@ColumnType(length=255)
	@ColumnComment("渠道IDs")
    private String channelIds;
    
    /**
     * 应用编码
     */
    @Excel(name = "应用编码")
    @TableField("app_code")
	@ColumnType(length=50)
	@ColumnComment("应用编码")
    private String appCode;
    
    /**
     * 请求次数
     */
    @Excel(name = "请求次数")
    @TableField("request_count")
	@ColumnType(length=10)
	@ColumnComment("请求次数")
    private int requestCount;
    
    /**
     * 验证次数
     */
    @TableField("validate_count")
	@ColumnType(length=2)
	@ColumnComment("验证次数")
    private int validateCount;
}
