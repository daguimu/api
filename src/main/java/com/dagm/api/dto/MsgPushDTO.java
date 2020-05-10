/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Guimu
 * @date 2020/05/10
 */
@Getter
@Setter
@Accessors(chain = true)
public class MsgPushDTO {

    private String title;
    private String body;
    private List<String> deviceIds;
}