package com.study.serviceremeber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceRemeberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRemeberApplication.class, args);
    }
}
