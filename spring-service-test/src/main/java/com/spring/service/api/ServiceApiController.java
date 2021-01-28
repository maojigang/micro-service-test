package com.spring.service.api;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KH on 2020/12/22.
 */
@RestController
public class ServiceApiController {


    @RequestMapping("/api/testMvc")
    public String testMvc(@RequestBody JSONObject object){
        return "testMvc" ;
    }
}
