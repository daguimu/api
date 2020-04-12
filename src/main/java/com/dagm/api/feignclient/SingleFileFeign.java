/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.feignclient;

import com.dagm.api.req.DeleteFileReq;
import com.dagm.devtool.res.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Guimu
 * @date 2020/01/08
 */
@FeignClient(value = "file-service")
public interface SingleFileFeign {

    /**
     * 删除短网址对应的文件
     *
     * @return 是否删除成功
     * @author Guimu
     * @date 2020/4/12
     */
    @PostMapping(value = "/delete")
    BaseResult<String> deleteFile(@RequestBody DeleteFileReq deleteFileReq);

}