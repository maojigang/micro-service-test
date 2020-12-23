package com.micro.nacos.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by KH on 2020/12/22.
 */
@FeignClient(name = "nacos-service")
public interface NacosServiceClient {

    @RequestMapping("/nacos-service/api/nacosService")
    public String nacosService();
}
