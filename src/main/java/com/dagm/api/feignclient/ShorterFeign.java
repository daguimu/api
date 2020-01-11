/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.feignclient;

import com.dagm.api.req.AddShortRecReq;
import com.dagm.devtool.res.BaseResult;
import feign.Response;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

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
     * @return com.dagm.shorter.res.BaseResult<java.lang.String>
     * @author Guimu
     * @date 2020/1/8
     */
    @PostMapping(value = "/inner/add")
    BaseResult<String> add(@RequestBody AddShortRecReq addShortRecReq);

    /**
     * 还原短网址
     *
     * @param addShortRecReq 还原短url
     * @return com.dagm.shorter.res.BaseResult<java.lang.String>
     * @author Guimu
     * @date 2020/1/8
     */
    @PostMapping(value = "/inner/restore")
    BaseResult<String> restore(@RequestBody AddShortRecReq addShortRecReq);
}