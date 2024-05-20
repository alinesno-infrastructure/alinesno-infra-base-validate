package com.alinesno.infra.base.validate.vo;

import lombok.Data;

/**
 * @author suze
 * @data 2023/03/04 下午 2:04
 */
@Data
public class DashBoardStatisticalDataItemVo {

    /**
     * 条目名称
     */
    private String name;

    /**
     * 条目值(数量)
     */
    private Long count=0L;

    /**
     * 变化百分比
     */
    private String percent;

    /**
     * 变化方向
     */
    private boolean isUp;

}
