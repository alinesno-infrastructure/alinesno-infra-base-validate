package com.alinesno.infra.base.validate.api.dto;

import lombok.Data;

/**
 * @author suze
 * @data 2023/03/03 下午 5:40
 */
@Data
public class StatisticalCountDto {

    private Long totalRequestCount;
    private Long successRequestCount;
    private Long failRequestCount;

    private Long totalVerifyCount;
    private Long successVerifyCount;
    private Long failVerifyCount;

}
