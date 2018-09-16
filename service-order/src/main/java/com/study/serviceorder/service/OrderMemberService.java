package com.study.serviceorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderMemberService {
    @Resource
    /**
     * 客户端连接工具
     */
    private RestTemplate restTemplate;

    public List<String> getMemberList(){
      return restTemplate.getForObject("http://service-member/member/list",List.class);
    }
}
