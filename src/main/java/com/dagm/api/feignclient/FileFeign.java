/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.feignclient;

import com.dagm.devtool.res.BaseResult;
import feign.Response;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Guimu
 * @date 2020/01/08
 */
@FeignClient(value = "file-service", configuration = FileFeign.MultipartSupportConfig.class)
@RequestMapping(value = "/inner")
public interface FileFeign {

    /**
     * 调用feign 对文件进行上传
     *
     * @param file 待上传的文件
     * @return com.dagm.shorter.res.BaseResult java.lang.String
     * @author Guimu
     * @date 2020/1/8
     */
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    BaseResult<String> upload(@RequestPart("file") MultipartFile file);

    /**
     * 等待下载文件名
     *
     * @param filename 文件名
     * @return feign.Response
     * @author Guimu
     * @date 2020/1/8
     */
    @GetMapping(value = "/download/{filename:.+}")
    Response download(@PathVariable("filename") String filename);

    /**
     * 删除短网址对应的文件
     *
     * @param filename 文件名
     * @return 是否删除成功
     * @author Guimu
     * @date 2020/4/12
     */
    @GetMapping(value = "/delete")
    BaseResult<String> deleteFile(@RequestParam(value = "filename") String filename);

    class MultipartSupportConfig {

        @Bean
        public Encoder feignFormEncoder() {
            return new SpringFormEncoder();
        }
    }
}