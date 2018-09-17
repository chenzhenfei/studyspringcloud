package com.study.serviceremeber.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/list")
    public List<String> getMemberList(){
        List<String> resutl =new ArrayList<>();
        resutl.add("zhangsan");
        resutl.add("lisi");
        resutl.add("wangwu");
        return  resutl;
    }
}
