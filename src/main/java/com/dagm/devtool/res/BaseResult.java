package com.dagm.devtool.res;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 基础响应结果类
 * @author Guimu
 * @param <T> 数据类型
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResult<T> {
    
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
     * 成功响应
     * @param data 数据
     * @param <T> 数据类型
     * @return BaseResult
     */
    public static <T> BaseResult<T> success(T data) {
        return new BaseResult<>(200, "操作成功", data);
    }
    
    /**
     * 成功响应
     * @param message 消息
     * @param data 数据
     * @param <T> 数据类型
     * @return BaseResult
     */
    public static <T> BaseResult<T> success(String message, T data) {
        return new BaseResult<>(200, message, data);
    }
    
    /**
     * 失败响应
     * @param message 错误消息
     * @param <T> 数据类型
     * @return BaseResult
     */
    public static <T> BaseResult<T> error(String message) {
        return new BaseResult<>(500, message, null);
    }
    
    /**
     * 失败响应
     * @param code 错误码
     * @param message 错误消息
     * @param <T> 数据类型
     * @return BaseResult
     */
    public static <T> BaseResult<T> error(Integer code, String message) {
        return new BaseResult<>(code, message, null);
    }
    
    /**
     * 判断是否成功
     * @return boolean
     */
    public boolean isSuccess() {
        return code != null && code == 200;
    }
}