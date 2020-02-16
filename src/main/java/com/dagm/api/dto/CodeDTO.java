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
 * @date 2020/02/16
 */
@Getter
@Setter
@Accessors(chain = true)
public class CodeDTO {

    private Integer channelId;
    private String phone;
    private String verificCode;
    private String bizTag;
}