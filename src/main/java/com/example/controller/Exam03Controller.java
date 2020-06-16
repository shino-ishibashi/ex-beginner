package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

    @Autowired
    private ServletContext application;

    @RequestMapping("")
    public String index(){
        return "exam03";
    }

    @RequestMapping("sum-price")
    public String sumPrice(){


        return
    }
}
