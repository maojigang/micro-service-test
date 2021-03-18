package com.micro.cloud.feign.client.service;

import org.springframework.stereotype.Component;

/**
 * Created by KH on 2021/3/18.
 */
@Component
public class FailBackService implements  CloudClientFeignService{

    @Override
    public String cloudClient() {
        return "fail";
    }
}
