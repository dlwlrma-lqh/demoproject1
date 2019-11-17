package com.lqh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/portal/index/")
public class indexController {

    @RequestMapping("ceshi.do")
    @ResponseBody
    public String ceshi(){
        System.out.println("<h1>OK</h1>");
        return "OK";
    }
}
