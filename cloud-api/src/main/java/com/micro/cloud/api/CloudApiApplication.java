package com.micro.cloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by KH on 2020/12/23.
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class CloudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApiApplication.class, args);
    }
}
