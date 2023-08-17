package com.alinesno.infra.base.validate.entity;

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
public class ApplicationEntity extends InfraBaseEntity {

    /**
     * 名称
     */
    @Excel(name = "名称")
    @TableField("name")
    private String name;
    
    /**
     * 应用编码
     */
    @Excel(name = "应用编码")
    @TableField("application_code")
    private String applicationCode;
    
    /**
     * 最大文件大小
     */
    @Excel(name = "最大文件大小")
    @TableField("max_file_size")
    private Long maxFileSize;
    
    /**
     * 文件类型
     */
    @Excel(name = "文件类型")
    @TableField("file_type")
    private String fileType;
    
    /**
     * API密钥
     */
    @Excel(name = "API密钥")
    @TableField("api_key")
    private String apiKey;
    
    /**
     * 最大上传次数
     */
    @Excel(name = "最大上传次数")
    @TableField("max_upload_count")
    private Long maxUploadCount;
    
    /**
     * 最大下载次数
     */
    @Excel(name = "最大下载次数")
    @TableField("max_download_count")
    private Long maxDownloadCount;
    
    /**
     * 公司名称
     */
    @Excel(name = "公司名称")
    @TableField("company_name")
    private String companyName;
    
    /**
     * 渠道IDs
     */
    @Excel(name = "渠道IDs")
    @TableField("channel_ids")
    private String channelIds;
    
    /**
     * 应用编码
     */
    @Excel(name = "应用编码")
    @TableField("app_code")
    private String appCode;
    
    /**
     * 请求次数
     */
    @Excel(name = "请求次数")
    @TableField("request_count")
    private int requestCount;
    
    /**
     * 验证次数
     */
    @TableField("validate_count")
    private int validateCount;
    
    // getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public Long getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public Long getMaxUploadCount() {
        return maxUploadCount;
    }

    public void setMaxUploadCount(Long maxUploadCount) {
        this.maxUploadCount = maxUploadCount;
    }

    public Long getMaxDownloadCount() {
        return maxDownloadCount;
    }

    public void setMaxDownloadCount(Long maxDownloadCount) {
        this.maxDownloadCount = maxDownloadCount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getChannelIds() {
        return channelIds;
    }

    public void setChannelIds(String channelIds) {
        this.channelIds = channelIds;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public int getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(int requestCount) {
        this.requestCount = requestCount;
    }

    public int getValidateCount() {
        return validateCount;
    }

    public void setValidateCount(int validateCount) {
        this.validateCount = validateCount;
    }
}
