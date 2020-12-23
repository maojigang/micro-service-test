package com.micro.nacos.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KH on 2020/12/22.
 */
@RestController
public class NaocosServiceApi {

    @RequestMapping("/nacos-service/api/nacosService")
    public String nacosService(){
        return "nacos-service";
    }
}
