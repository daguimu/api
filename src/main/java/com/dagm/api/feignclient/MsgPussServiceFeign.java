/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.feignclient;

import com.dagm.api.dto.MsgPushDTO;
import com.dagm.devtool.res.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 消息推送服务feign
 *
 * @author Guimu
 * @date 2020/01/08
 */
@FeignClient(value = "sms-service")
public interface MsgPussServiceFeign {


    /**
     * 消息推送
     *
     * @param msgPushto 推送消息参数
     * @return feign.Response
     * @author Guimu
     * @date 2020/2/16
     */
    @PostMapping(value = "/inner/pushMsg")
    BaseResult<Boolean> pushMsg(@RequestBody MsgPushDTO msgPushto);

}