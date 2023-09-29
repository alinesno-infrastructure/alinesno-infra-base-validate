package com.alinesno.infra.base.validate.mapper;

import com.alinesno.infra.base.validate.entity.TOTPRecordEntity;
import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * TOTP验证记录数据访问接口
 */
public interface TOTPRecordMapper extends IBaseMapper<TOTPRecordEntity> {
}
