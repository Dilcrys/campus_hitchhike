package com.lmx.hitchhike.common.utils;

import lombok.Data;

/**
 * 接口返回结果类型
 * @param <T>
 * @author lmx
 */
@Data
public class Result<T> {
    private String code;
    private String msg;
    private T data;
}
