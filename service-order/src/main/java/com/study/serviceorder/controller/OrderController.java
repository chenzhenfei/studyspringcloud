package com.study.serviceorder.controller;

import com.study.serviceorder.service.OrderMemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
     private OrderMemberService orderMemberService;

    @GetMapping("/list")
    public List<String> getMemberList(){
        System.out.println("订单服务开始调用会员服务");
        return orderMemberService.getMemberList();
    }
}
