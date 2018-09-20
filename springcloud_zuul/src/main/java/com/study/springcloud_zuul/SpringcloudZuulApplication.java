package com.study.springcloud_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
/**
 * 开启网关
 */
@EnableZuulProxy
public class SpringcloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulApplication.class, args);
    }
}
