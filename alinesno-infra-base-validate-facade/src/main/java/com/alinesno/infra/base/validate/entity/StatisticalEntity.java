package com.alinesno.infra.base.validate.entity;

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
public class StatisticalEntity extends InfraBaseEntity {

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 应用码
     */
    @TableField("application_code")
    private String applicationCode;

    /**
     * 总请求数
     */
    @TableField("total_request_count")
    private Long totalRequestCount;

    /**
     * 验证成功数
     */
    @TableField("success_request_count")
    private Long successRequestCount;

    /**
     * 验证失败数
     */
    @TableField("fail_request_count")
    private Long failRequestCount;

    /**
     * 当月总请求数
     */
    @TableField("mon_total_request_count")
    private Long monTotalRequestCount;

    /**
     * 当月验证成功数
     */
    @TableField("mon_success_request_count")
    private Long monSuccessRequestCount;

    /**
     * 当月验证失败数
     */
    @TableField("mon_fail_request_count")
    private Long monFailRequestCount;

    /**
     * 当天总请求数
     */
    @TableField("day_total_request_count")
    private Long dayTotalRequestCount;

    /**
     * 当天验证成功数
     */
    @TableField("day_success_request_count")
    private Long daySuccessRequestCount;

    /**
     * 当天验证失败数
     */
    @TableField("day_fail_request_count")
    private Long dayFailRequestCount;

    /**
     * 总请求数
     */
    @TableField("total_verify_count")
    private Long totalVerifyCount;

    /**
     * 验证成功数
     */
    @TableField("success_verify_count")
    private Long successVerifyCount;

    /**
     * 验证失败数
     */
    @TableField("fail_verify_count")
    private Long failVerifyCount;

    /**
     * 当月总请求数
     */
    @TableField("mon_total_verify_count")
    private Long monTotalVerifyCount;

    /**
     * 当月验证成功数
     */
    @TableField("mon_success_verify_count")
    private Long monSuccessVerifyCount;

    /**
     * 当月验证失败数
     */
    @TableField("mon_fail_verify_count")
    private Long monFailVerifyCount;

    /**
     * 当天总请求数
     */
    @TableField("day_total_verify_count")
    private Long dayTotalVerifyCount;

    /**
     * 当天验证成功数
     */
    @TableField("day_success_verify_count")
    private Long daySuccessVerifyCount;

    /**
     * 当天验证失败数
     */
    @TableField("day_fail_verify_count")
    private Long dayFailVerifyCount;

    // 省略getter和setter方法
}
