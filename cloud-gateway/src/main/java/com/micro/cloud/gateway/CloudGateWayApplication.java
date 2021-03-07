package com.micro.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by KH on 2020/12/23.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudGateWayApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(CloudGateWayApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
