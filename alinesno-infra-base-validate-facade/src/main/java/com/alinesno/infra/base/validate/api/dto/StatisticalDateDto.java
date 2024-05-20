package com.alinesno.infra.base.validate.api.dto;

import lombok.Data;

/**
 * @author suze
 * @data 2023/03/03 下午 3:15
 */
@Data
public class StatisticalDateDto {

    private StatisticalCountDto total;
    private StatisticalCountDto monTotal;
    private StatisticalCountDto dayTotal;

}
