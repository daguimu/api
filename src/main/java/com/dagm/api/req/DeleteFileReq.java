/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.req;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Guimu
 * @date 2020/04/12
 */

@Getter
@Setter
@Accessors(chain = true)
public class DeleteFileReq {

    /**
     * 短网址文件名
     */
    private String filename;
}