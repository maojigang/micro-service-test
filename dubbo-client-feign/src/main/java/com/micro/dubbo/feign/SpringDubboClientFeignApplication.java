package com.micro.dubbo.feign;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lenovo on 2020/12/18.
 */
@SpringBootApplication
@EnableDubbo
public class SpringDubboClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDubboClientFeignApplication.class, args);
    }
}
