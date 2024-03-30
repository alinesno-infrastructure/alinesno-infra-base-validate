package com.alinesno.infra.base.validate.api.provider;

import com.alinesno.infra.base.validate.api.dto.BindTOTPRequest;
import com.alinesno.infra.base.validate.api.dto.ValidateTOTPRequest;
import com.alinesno.infra.base.validate.service.ITOTPService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * TOTP控制器
 */
@RestController
public class TOTPController {

    private final ITOTPService ITOTPService;

    public TOTPController(ITOTPService ITOTPService) {
        this.ITOTPService = ITOTPService;
    }

    /**
     * 绑定TOTP接口
     *
     * @param request 绑定TOTP请求
     */
    @PostMapping("/bind")
    public void bindTOTP(@RequestBody BindTOTPRequest request) {
        Long userId = request.getUserId();
        String secretKey = request.getSecretKey();
        ITOTPService.bindTOTP(userId, secretKey);
    }

    /**
     * 验证TOTP接口
     *
     * @param request 验证TOTP请求
     * @return 验证结果
     */
    @PostMapping("/validate")
    public boolean validateTOTP(@RequestBody ValidateTOTPRequest request) {
        Long userId = request.getUserId();
        String code = request.getCode();
        return ITOTPService.validateTOTP(userId, code);
    }
}
