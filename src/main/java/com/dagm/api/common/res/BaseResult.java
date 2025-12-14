/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.common.res;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 统一响应结果封装
 *
 * @author Guimu
 * @date 2020/01/03
 */
@Getter
@Setter
@Accessors(chain = true)
public class BaseResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 是否成功
     */
    private Boolean success;

    public static <T> BaseResult<T> success(T data) {
        BaseResult<T> result = new BaseResult<>();
        result.setCode(200);
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static <T> BaseResult<T> fail(String message) {
        BaseResult<T> result = new BaseResult<>();
        result.setCode(500);
        result.setSuccess(false);
        result.setMessage(message);
        return result;
    }
}
