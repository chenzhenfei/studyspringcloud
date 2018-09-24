package com.study.serviceorder.controller;

import com.study.serviceorder.service.OrderMemberService;
import com.study.serviceorder.service.OrderMemberServiceFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
@Api(value = "订单控制器",description = "订单服务控制类")
public class OrderController {


    @Resource
    private OrderMemberService orderMemberService;


    @Resource
    private OrderMemberServiceFeign orderMemberServiceFeign;


    @ApiOperation(value ="根据RestTemplate 客户端调用服务",notes = "使用restTemplate 客户端调用接口服务",response = List.class)
    @GetMapping("/listForRestTempLate")
    public List<String> getMemberListForRestTemplate(){
        System.out.println("订单服务通过Rest客户端开始调用会员服务");
        return orderMemberService.getMemberList();
    }

    @ApiOperation(value ="根据RestTemplate 客户端调用服务",notes = "使用restTemplate 客户端调用接口服务",response = List.class)
    @GetMapping("/listForFeignClient")
    public List<String> getMemberListForFeign(){
        System.out.println("订单服务通过Feign客户端开始调用会员服务");
        return orderMemberServiceFeign.getMemberList();
    }
}
