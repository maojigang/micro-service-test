package com.micro.cloud.feign.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by KH on 2020/12/22.
 */
@FeignClient(name = "cloud-client",fallback = FailBackService.class)
public interface CloudClientFeignService {

    @RequestMapping("/cloud-client/api/cloudClient")
    public String cloudClient();
}
