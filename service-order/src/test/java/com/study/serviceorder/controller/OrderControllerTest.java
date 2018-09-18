package com.study.serviceorder.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
@WebAppConfiguration
public class OrderControllerTest {

    @Autowired
    private OrderController orderController;

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;


    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(orderController).build();
    }

    @Test
    public void getMemberListForRestTemplate() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.
                get("/order/listForRestTempLate")).
                andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void getMemberListForFeign() throws Exception {
        ResultActions order=mockMvc.perform(MockMvcRequestBuilders.
                get("/order/listForFeignClient")).
                andExpect(MockMvcResultMatchers.status().isOk());
    }


    @After
    public void tearDown() throws Exception {
        System.out.println("junit 結束");
    }
}