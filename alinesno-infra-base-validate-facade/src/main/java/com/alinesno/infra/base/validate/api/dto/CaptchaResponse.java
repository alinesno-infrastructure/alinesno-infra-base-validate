package com.alinesno.infra.base.validate.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.image.BufferedImage;

/**
 * 验证码响应类
 * 用于封装验证码相关的响应数据
 * 包含验证码ID和验证码图片
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaptchaResponse {

    private String captchaId;          // 验证码ID
    private BufferedImage captchaImage; // 验证码图片

}
