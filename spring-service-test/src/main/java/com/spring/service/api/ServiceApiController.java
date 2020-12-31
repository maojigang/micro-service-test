package com.spring.service.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KH on 2020/12/22.
 */
@RestController
public class ServiceApiController {

    @RequestMapping("/api/testMvc")
    public String testMvc(){
        return "testMvc";
    }
}
