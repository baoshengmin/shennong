package com.fubai.shennong.activity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.fubai.shennong.activity.dao")
public class SnActivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnActivityApplication.class,args);
    }

}
