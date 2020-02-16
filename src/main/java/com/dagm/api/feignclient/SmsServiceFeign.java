/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.feignclient;

import com.dagm.api.dto.CodeDTO;
import com.dagm.api.dto.GenerateCodeDTO;
import com.dagm.api.dto.SmsDetail;
import com.dagm.devtool.res.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 短信服务feign
 *
 * @author Guimu
 * @date 2020/01/08
 */
@FeignClient(value = "sms-service")
public interface SmsServiceFeign {

    /**
     * 调用feign 获取手机验证码
     *
     * @param generateCodeDto 获取验证码参数
     * @return com.dagm.devtool.res.BaseResult<java.lang.String>
     * @author Guimu
     * @date 2020/2/16
     */
    @PostMapping(value = "/inner/getVerCode")
    BaseResult<String> getVerCode(@RequestBody GenerateCodeDTO generateCodeDto);

    /**
     * 校验验证码是否有效
     *
     * @param codeDto 校验验证码参数
     * @return feign.Response
     * @author Guimu
     * @date 2020/2/16
     */
    @PostMapping(value = "/inner/checkVerCode")
    BaseResult<Boolean> checkVerCode(@RequestBody CodeDTO codeDto);

    /**
     * @param phone 待查手机号
     * @param bizId 业务id
     * @return com.dagm.devtool.res.BaseResult<com.dagm.api.dto.SmsDetail> 短信详情
     * @author Guimu
     * @date 2020/2/16
     */
    @GetMapping(value = "/inner/getSmsDetail")
    BaseResult<SmsDetail> getSmsDetail(@RequestParam(value = "phone") String phone,
        @RequestParam(value = "bizId") String bizId);

}