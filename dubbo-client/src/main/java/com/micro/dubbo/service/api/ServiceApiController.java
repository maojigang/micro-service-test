package com.micro.dubbo.service.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.micro.dubbo.api.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by KH on 2020/12/22.
 */
@RestController
public class ServiceApiController {

    @Reference(version = "1.0.0")
    private DubboService dubboService;

    @RequestMapping("/api/testMvc")
    public String testMvc(){
        String s = dubboService.testFeign();
        return "testMvc " + s;
    }
}
