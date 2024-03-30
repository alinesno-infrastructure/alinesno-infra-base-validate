package com.alinesno.infra.base.validate.api.provider;

import com.alinesno.infra.base.validate.api.dto.CaptchaResponse;
import com.alinesno.infra.base.validate.api.dto.CaptchaVerificationRequest;
import com.alinesno.infra.base.validate.service.ICaptchaService;
import com.alinesno.infra.common.facade.response.AjaxResult;
import org.springframework.web.bind.annotation.*;

/**
 * 验证码控制器
 */
@RestController
@RequestMapping("/api")
public class CaptchaController {
    private final ICaptchaService captchaService;

    public CaptchaController(ICaptchaService captchaService) {
        this.captchaService = captchaService;
    }

    /**
     * 生成验证码
     *
     * @return 生成的验证码响应
     */
    @GetMapping("/captcha")
    public AjaxResult generateCaptcha() {
        CaptchaResponse captchaResponse = captchaService.generateCaptchaImage();
        return AjaxResult.success(captchaResponse);
    }

    /**
     * 验证验证码
     *
     * @param request 验证码验证请求
     * @return 验证结果响应
     */
    @PostMapping("/captcha/verify")
    public AjaxResult verifyCaptcha(@RequestBody CaptchaVerificationRequest request) {
        boolean result = captchaService.verifyCaptcha(request.getCaptchaId(), request.getCaptchaValue());
        if (result) {
            return AjaxResult.success("Verification successful");
        } else {
            return AjaxResult.error("Verification failed");
        }
    }
}
