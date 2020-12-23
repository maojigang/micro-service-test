package com.micro.nacos.feign.api;

import com.micro.nacos.feign.service.NacosServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KH on 2020/12/22.
 */
@RestController
public class NaocosFeignServiceApi {

    @Autowired
    private NacosServiceClient nacosServiceClient;

    @RequestMapping("/nacos-service-feign/api/nacosServiceFeign")
    public String nacosService(){
        String service = nacosServiceClient.nacosService();
        return "nacos-service-feign " + service;
    }
}
