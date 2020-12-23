package com.micro.cloud.feign.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by KH on 2020/12/23.
 */
@EnableFeignClients(basePackages = "com.micro.cloud.feign.client.service")
@EnableDiscoveryClient
@SpringBootApplication
public class CloudFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignClientApplication.class,args);
    }

}
