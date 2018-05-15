package com.qqx.controller;

import com.qqx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ASUS on 2018/5/10.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/ue")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/qqxue")
    @ResponseBody
    public  String test1() {
        String ue = testService.getString("admin", "男");
        return ue;
    }

}
