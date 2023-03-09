package com.fubai.shennong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SnPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnPortalApplication.class,args);
    }

}
