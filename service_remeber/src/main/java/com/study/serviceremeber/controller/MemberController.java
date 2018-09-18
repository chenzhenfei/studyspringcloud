package com.study.serviceremeber.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/member")
@Api(value = "会员服务控制器",description = "会员服务控制类")
public class MemberController {

    @GetMapping("/list")
    @ApiOperation(value = "获取会员列表",notes = "获取所有的会员列表",response = List.class)
    public List<String> getMemberList(){
        List<String> resutl =new ArrayList<>();
        resutl.add("zhangsan");
        resutl.add("lisi");
        resutl.add("wangwu");
        return  resutl;
    }
}
