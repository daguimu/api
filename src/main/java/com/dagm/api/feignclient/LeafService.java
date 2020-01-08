/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * leaf service feign client
 *
 * @author Guimu
 * @date 2020/01/08
 */
@FeignClient(name = "leaf-service")
public interface LeafService {


    /**
     * 根据biz_tag feign client 调用获取leaf key
     *
     * @param tag 业务标识tag
     * @return java.lang.String
     * @author Guimu
     * @date 2020/1/8
     */
    @GetMapping(value = "/get/{tag}")
    String generateUniqueKey(@PathVariable(value = "tag") String tag);
}
