package com.study.serviceorder.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderMemberServiceFeignFallBack implements OrderMemberServiceFeign {
    @Override
    public List<String> getMemberList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("member user is empty");
        return listUser;
    }
}
