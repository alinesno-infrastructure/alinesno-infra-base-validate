package com.alinesno.infra.base.validate.api.dto;

import lombok.Data;

/**
 * @author suze
 * @date
 * @since
 */
@Data
public class CoordinateDataDto {

    /**
     * ip 地址
     */
    private String ip ;

    /**
     * 添加时间
     */
    private Long addTime;

    /**
     *
     */
    private Long resultCode;

}
