package com.study.serviceremeber.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/member")
@Api(value = "会员服务控制器",description = "会员服务控制类")
public class MemberController {


    /**
     * # 测试 spring cloud ribbon 的负载均衡,启动两个会员服务注册到eureka 上,通过restTemplate 或者 feign 客户端调用会员服务是
     *   spring cloud 客户端会启用 ribbon 做负载均衡轮询算法,多个服务轮流调用,起到作用
     */
    @Value("${server.port}")
    private String port;

    @GetMapping("/list")
    @ApiOperation(value = "获取会员列表",notes = "获取所有的会员列表",response = List.class)
    public List<String> getMemberList() throws InterruptedException {
        Thread.sleep(3000);
        List<String> resutl =new ArrayList<>();
        resutl.add("zhangsan");
        resutl.add("lisi");
        resutl.add("wangwu");
        resutl.add("serverPort:"+this.port);
        return  resutl;
    }



    @GetMapping("/list1")
    @ApiOperation(value = "获取会员列表",notes = "获取所有的会员列表",response = List.class)
    public List<String> getMemberListForZullFilter(@RequestParam("filter") String filter) throws InterruptedException {
//        Thread.sleep(500);
        List<String> resutl =new ArrayList<>();
        resutl.add("zhangsan");
        resutl.add("lisi");
        resutl.add("wangwu");
        resutl.add("serverPort:"+this.port);
        resutl.add("requestParam:"+filter);
        return  resutl;
    }
}
