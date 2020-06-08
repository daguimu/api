package com.dagm.api.config;

import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Guimu
 * @date 2020/06/08
 */
@EnableFeignClients(basePackages = {"com.dagm.api.feignclient"})
public class ApiConfig {
}

