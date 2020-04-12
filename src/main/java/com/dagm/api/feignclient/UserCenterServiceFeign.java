/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.feignclient;

import com.dagm.api.dto.UserDTO;
import com.dagm.api.req.ChangeAvatarReq;
import com.dagm.devtool.res.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 短信服务feign
 *
 * @author Guimu
 * @date 2020/01/08
 */
@FeignClient(value = "user-center")
public interface UserCenterServiceFeign {

    /**
     * 根据token获取userDto
     *
     * @param token 用户token
     * @return UserDTO 用户信息
     * @author Guimu
     * @date 2020/2/16
     */
    @GetMapping(value = "/inner/getUserByToken")
    BaseResult<UserDTO> getUserByToken(@RequestParam(value = "token") String token);

    /**
     * 根据userId获取userDto
     *
     * @param userId 用户id
     * @return UserDTO 用户信息
     * @author Guimu
     * @date 2020/2/16
     */
    @GetMapping(value = "/inner/getUserById")
    BaseResult<UserDTO> getUserById(@RequestParam(value = "userId") Long userId);

    /**
     * 增加需改用户头像的inner api
     * @return  Boolean 是否修改成功
     * @author Guimu
     * @date 2020/4/12
     */
    @PostMapping("/inner/chengeAvatarUrl")
    BaseResult<Boolean> getUserById(ChangeAvatarReq changeAvatarReq);


}