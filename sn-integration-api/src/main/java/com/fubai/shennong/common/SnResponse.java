package com.fubai.shennong.common;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SnResponse<T> {
    public int code;
    public String msg = "操作成功";
    public T data;
}
