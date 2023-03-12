package com.fubai.shennong.common;

public class SnResponseBuilder {

    private SnResponseBuilder(){}


    public static <T> SnResponse<T> success() {
        return new SnResponse<>(SnResponseEnum.OK.getCode(), SnResponseEnum.OK.getMessage(), null);
    }

    public static <T> SnResponse<T> success(T obj) {
        return new SnResponse<>(SnResponseEnum.OK.getCode(), SnResponseEnum.OK.getMessage(), obj);
    }

    public static <T> SnResponse<T> success(String message) {
        return new SnResponse<>(SnResponseEnum.OK.getCode(), message, null);
    }

    public static <T> SnResponse<T> fail() {
        return new SnResponse<>(SnResponseEnum.FAIL.getCode(), SnResponseEnum.FAIL.getMessage(), null);
    }

    public static <T> SnResponse<T> fail(String msg) {
        return new SnResponse<>(SnResponseEnum.FAIL.getCode(), msg, null);
    }

}
