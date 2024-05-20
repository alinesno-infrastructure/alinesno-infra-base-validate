package com.alinesno.infra.base.validate.service.impl;

import com.alinesno.infra.base.validate.entity.ProjectEntity;
import com.alinesno.infra.base.validate.mapper.ProjectMapper;
import com.alinesno.infra.base.validate.service.IProjectService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProjectServiceImpl extends IBaseServiceImpl<ProjectEntity , ProjectMapper> implements IProjectService {
}
