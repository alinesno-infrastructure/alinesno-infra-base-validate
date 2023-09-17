package com.alinesno.infra.base.validate.config;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Kaptcha配置类
 */
@Configuration
public class KaptchaConfig {

    /**
     * 创建验证码生成器
     *
     * @return 验证码生成器实例
     */
    @Bean
    public Producer captchaProducer() {
        Properties properties = new Properties();
        properties.put("kaptcha.image.width", "150");
        properties.put("kaptcha.image.height", "50");
        properties.put("kaptcha.textproducer.font.size", "32");
        properties.put("kaptcha.textproducer.char.length", "4");
        // ... 可以设置更多的属性

        Config config = new Config(properties);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
