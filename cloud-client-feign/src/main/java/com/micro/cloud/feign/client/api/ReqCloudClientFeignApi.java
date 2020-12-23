package com.micro.cloud.feign.client.api;

import com.micro.cloud.feign.client.service.CloudClientFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KH on 2020/12/23.
 */
@RestController
public class ReqCloudClientFeignApi {

    @Autowired
    private CloudClientFeignService cloudClientFeignService;

    @RequestMapping("/cloud-client-feign/api/cloudFeignClient")
    public String cloudFeignClient(){
        System.out.println("----- cloud-client-feign -----");
        String cloudClient = cloudClientFeignService.cloudClient();
        return "cloudFeignClient  " + cloudClient;
    }
}
