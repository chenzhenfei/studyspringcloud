package com.study.serviceorder.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 使用feign client 实现服务调用  均有ribbon 的负债均衡支持
 */

@FeignClient(value = "service-member",path = "/member",fallback = OrderMemberServiceFeignFallBack.class)
public interface OrderMemberServiceFeign {

    @RequestMapping(value ="/list", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getMemberList();

}
