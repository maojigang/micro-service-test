package com.micro.dubbo.feign.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.micro.dubbo.api.DubboService;

/**
 * Created by lenovo on 2021/3/28.
 */
@Service(version = "1.0.0",interfaceClass = DubboService.class)
public class DubboServiceImpl implements DubboService {

    @Override
    public String testFeign() {
        return "testFeign";
    }
}
