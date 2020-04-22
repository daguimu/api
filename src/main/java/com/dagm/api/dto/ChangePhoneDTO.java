/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.dto;

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
public class ChangePhoneDTO {


    private Long userId;


    private String phone;

    private String verificCode;

    private Integer channelId;
    }