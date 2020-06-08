package com.dagm.api.config;

import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.dagm.api.feignclient"})
public class ApiConfig {

}

