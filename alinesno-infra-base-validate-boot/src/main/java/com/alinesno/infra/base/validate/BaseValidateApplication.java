package com.alinesno.infra.base.validate;

import com.alinesno.infra.common.web.adapter.sso.enable.EnableInfraSsoApi;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 集成一个Java开发示例工具
 * @author LuoAnDong
 * @since 2023年8月3日 上午6:23:43
 */
@EnableInfraSsoApi
@MapperScan("com.alinesno.infra.base.validate.mapper")
@SpringBootApplication
public class BaseValidateApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseValidateApplication.class, args);
	}

}