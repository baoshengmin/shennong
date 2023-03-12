package com.fubai.shennong.common;


public enum SnResponseEnum {
    OK(1,"成功"),
    FAIL(0,"失败"),
    TOKEN_EXPIRED(300, "token已失效，请重新登录"),
    PARAM_ERROR(400, "参数异常"),
    SERVICE_ERROR(500, "服务错误");

    private int code;
    private String message;

    SnResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
