package com.alinesno.infra.base.validate.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 统计实体类
 * 
 * <p>该类对应数据库表名为 "statistical"</p>
 * 
 * <p>字段注释：</p>
 * <ul>
 *   <li>userId: 用户id</li>
 *   <li>applicationCode: 应用码</li>
 *   <li>totalRequestCount: 总请求数</li>
 *   <li>successRequestCount: 验证成功数</li>
 *   <li>failRequestCount: 验证失败数</li>
 *   <li>monTotalRequestCount: 当月总请求数</li>
 *   <li>monSuccessRequestCount: 当月验证成功数</li>
 *   <li>monFailRequestCount: 当月验证失败数</li>
 *   <li>dayTotalRequestCount: 当天总请求数</li>
 *   <li>daySuccessRequestCount: 当天验证成功数</li>
 *   <li>dayFailRequestCount: 当天验证失败数</li>
 *   <li>totalVerifyCount: 总请求数</li>
 *   <li>successVerifyCount: 验证成功数</li>
 *   <li>failVerifyCount: 验证失败数</li>
 *   <li>monTotalVerifyCount: 当月总请求数</li>
 *   <li>monSuccessVerifyCount: 当月验证成功数</li>
 *   <li>monFailVerifyCount: 当月验证失败数</li>
 *   <li>dayTotalVerifyCount: 当天总请求数</li>
 *   <li>daySuccessVerifyCount: 当天验证成功数</li>
 *   <li>dayFailVerifyCount: 当天验证失败数</li>
 * </ul>
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("statistical")
@Data
public class StatisticalEntity extends InfraBaseEntity {

    /**
     * 用户id
     */
    @TableField("user_id")
	@ColumnType(length=50)
	@ColumnComment("用户id")
    private String userId;

    /**
     * 应用码
     */
    @TableField("application_code")
	@ColumnType(length=50)
	@ColumnComment("应用码")
    private String applicationCode;

    /**
     * 总请求数
     */
    @TableField("total_request_count")
	@ColumnType(length=10)
	@ColumnComment("总请求数")
    private Long totalRequestCount;

    /**
     * 验证成功数
     */
    @TableField("success_request_count")
	@ColumnType(length=10)
	@ColumnComment("验证成功数")
    private Long successRequestCount;

    /**
     * 验证失败数
     */
    @TableField("fail_request_count")
	@ColumnType(length=255)
	@ColumnComment("验证失败数")
    private Long failRequestCount;

    /**
     * 当月总请求数
     */
    @TableField("mon_total_request_count")
	@ColumnType(length=10)
	@ColumnComment("当月总请求数")
    private Long monTotalRequestCount;

    /**
     * 当月验证成功数
     */
    @TableField("mon_success_request_count")
	@ColumnType(length=10)
	@ColumnComment("当月验证成功数")
    private Long monSuccessRequestCount;

    /**
     * 当月验证失败数
     */
    @TableField("mon_fail_request_count")
	@ColumnType(length=10)
	@ColumnComment("当月验证失败数")
    private Long monFailRequestCount;

    /**
     * 当天总请求数
     */
    @TableField("day_total_request_count")
	@ColumnType(length=10)
	@ColumnComment("当天总请求数")
    private Long dayTotalRequestCount;

    /**
     * 当天验证成功数
     */
    @TableField("day_success_request_count")
	@ColumnType(length=10)
	@ColumnComment("当天验证成功数")
    private Long daySuccessRequestCount;

    /**
     * 当天验证失败数
     */
    @TableField("day_fail_request_count")
	@ColumnType(length=10)
	@ColumnComment("当天验证失败数")
    private Long dayFailRequestCount;

    /**
     * 总请求数
     */
    @TableField("total_verify_count")
	@ColumnType(length=10)
	@ColumnComment("总请求数")
    private Long totalVerifyCount;

    /**
     * 验证成功数
     */
    @TableField("success_verify_count")
	@ColumnType(length=10)
	@ColumnComment("验证成功数")
    private Long successVerifyCount;

    /**
     * 验证失败数
     */
    @TableField("fail_verify_count")
	@ColumnType(length=2)
	@ColumnComment("验证失败数")
    private Long failVerifyCount;

    /**
     * 当月总请求数
     */
    @TableField("mon_total_verify_count")
	@ColumnType(length=10)
	@ColumnComment("当月总请求数")
    private Long monTotalVerifyCount;

    /**
     * 当月验证成功数
     */
    @TableField("mon_success_verify_count")
	@ColumnType(length=10)
	@ColumnComment("当月验证成功数")
    private Long monSuccessVerifyCount;

    /**
     * 当月验证失败数
     */
    @TableField("mon_fail_verify_count")
	@ColumnType(length=10)
	@ColumnComment("当月验证失败数")
    private Long monFailVerifyCount;

    /**
     * 当天总请求数
     */
    @TableField("day_total_verify_count")
	@ColumnType(length=10)
	@ColumnComment("当天总请求数")
    private Long dayTotalVerifyCount;

    /**
     * 当天验证成功数
     */
    @TableField("day_success_verify_count")
	@ColumnType(length=10)
	@ColumnComment("当天验证成功数")
    private Long daySuccessVerifyCount;

    /**
     * 当天验证失败数
     */
    @TableField("day_fail_verify_count")
	@ColumnType(length=10)
	@ColumnComment("当天验证失败数")
    private Long dayFailVerifyCount;
}
