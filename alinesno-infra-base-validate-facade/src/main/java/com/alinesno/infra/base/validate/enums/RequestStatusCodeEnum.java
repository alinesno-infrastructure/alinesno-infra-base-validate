package com.alinesno.infra.base.validate.enums;

/**
 * @author suze
 * @data 2023/03/03 上午 9:59
 */
public enum RequestStatusCodeEnum {

    REQUEST_SUCCESS(0x00,"请求验证码成功"),
    REQUEST_FAIL(0x01,"请求验证码失败"),
    VERIFY_SUCCESS(0x10,"验证成功"),
    VERIFY_FAIL(0x11,"验证失败")
    ;

    private int code;
    private String message;

    RequestStatusCodeEnum(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
