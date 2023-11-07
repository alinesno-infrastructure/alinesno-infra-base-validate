package com.alinesno.infra.base.validate.service.impl;

import com.alinesno.infra.base.validate.entity.BlacklistEntity;
import com.alinesno.infra.base.validate.mapper.BlacklistMapper;
import com.alinesno.infra.base.validate.service.IBlacklistService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BlacklistServiceImpl extends IBaseServiceImpl<BlacklistEntity, BlacklistMapper> implements IBlacklistService {
}
