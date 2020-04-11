/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Guimu
 * @date 2020/02/15
 */
@Getter
@Setter
@Accessors(chain = true)
public class UserDTO {

    private Integer channelId;
    private Long userId;
    private String phone;
    private String userName;
    private String nickName;
    private Integer userType;
    private Integer status;
    private Date addTime;
    private String avatarUrl;
    private String wallPaper;
}