package com.micro.nacos.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by lenovo on 2020/12/18.
 */
@EnableFeignClients(basePackages = "com.micro.nacos.feign.service")
@EnableDiscoveryClient
@SpringBootApplication
public class NacosServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceFeignApplication.class, args);
    }
}
