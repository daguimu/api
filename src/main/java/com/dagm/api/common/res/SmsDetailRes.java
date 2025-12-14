/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package com.dagm.api.common.res;

import com.dagm.api.common.model.BaseObject;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Guimu
 * @date  2019/10/06
 */
@Getter
@Setter
@Accessors(chain = true)
public class SmsDetailRes extends BaseObject {

    private String phoneNum;
    private Long sendStatus;
    private String errCode;
    private String templateCode;
    private String content;
    private String sendDate;
    private String receiveDate;
    private String outId;
}