package com.study.serviceorder.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderMemberService {
    @Resource
    /**
     * 客户端连接工具
     */
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "getOrderError")
    public List<String> getMemberList(){
      return restTemplate.getForObject("http://service-member/member/list",List.class);
    }

    public List<String> getOrderError(){
        List<String> listUser = new ArrayList<String>();
        listUser.add("member user is empty");
        return listUser;
    }


}
