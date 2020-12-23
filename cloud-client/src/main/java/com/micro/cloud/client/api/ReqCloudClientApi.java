package com.micro.cloud.client.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KH on 2020/12/23.
 */
@RestController
public class ReqCloudClientApi {

    @RequestMapping("/cloud-client/api/cloudClient")
    public String cloudClient(){
        System.out.println("----- cloud-client -----");
        return "cloud-client";
    }
}
