/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */

package com.dagm.api.feignclient;

import com.dagm.api.common.req.AddShortRecReq;
import com.dagm.devtool.res.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Guimu
 * @date 2020/01/08
 */
@FeignClient(value = "shorter-service")
public interface ShorterFeign {

    /**
     * 短网址转换
     *
     * @param addShortRecReq 待转换的url
     * @return com.dagm.shorter.res.BaseResult java.lang.String
     * @author Guimu
     * @date 2020/1/8
     */
    @PostMapping(value = "/inner/add")
    BaseResult<String> add(@RequestBody AddShortRecReq addShortRecReq);

    /**
     * 还原短网址
     *
     * @param addShortRecReq 还原短url
     * @return com.dagm.shorter.res.BaseResult java.lang.String
     * @author Guimu
     * @date 2020/1/8
     */
    @PostMapping(value = "/inner/restore")
    BaseResult<String> restore(@RequestBody AddShortRecReq addShortRecReq);
}