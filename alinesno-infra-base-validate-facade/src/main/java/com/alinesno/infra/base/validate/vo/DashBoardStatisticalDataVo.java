package com.alinesno.infra.base.validate.vo;

import lombok.Data;

/**
 * @author suze
 * @data 2023/03/06 下午 4:39
 */
@Data
public class DashBoardStatisticalDataVo {

    /**
     * 总请求数
     */
    private DashBoardStatisticalDataItemVo totalRequestCount;

    /**
     * 请求成功数
     */
    private DashBoardStatisticalDataItemVo successRequestCount;

    /**
     * 请求失败数
     */
    private DashBoardStatisticalDataItemVo failRequestCount;

    /**
     * 总验证数
     */
    private DashBoardStatisticalDataItemVo totalVerifyCount;

    /**
     * 验证成功数
     */
    private DashBoardStatisticalDataItemVo successVerifyCount;

    /**
     * 验证失败数
     */
    private DashBoardStatisticalDataItemVo failVerifyCount;

}
