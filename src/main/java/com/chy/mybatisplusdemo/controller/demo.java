package com.chy.mybatisplusdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class demo {
    @ResponseBody
    @RequestMapping("/hello")
    public String getHello(){
        return "hello";
    }
}
