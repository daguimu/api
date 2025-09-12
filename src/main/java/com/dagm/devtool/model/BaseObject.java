package com.dagm.devtool.model;

import lombok.Data;
import com.alibaba.fastjson2.JSON;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基础对象类
 * @author Guimu
 */
@Data
public class BaseObject implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    
    /**
     * 转换为JSON字符串
     * @return JSON字符串
     */
    public String toJson() {
        return JSON.toJSONString(this);
    }
    
    /**
     * 从JSON字符串转换为对象
     * @param json JSON字符串
     * @param clazz 目标类型
     * @param <T> 泛型类型
     * @return 对象实例
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }
    
    @Override
    public String toString() {
        return toJson();
    }
}