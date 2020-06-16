package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {


    /**
     * 入力画面にフォワードするメソッド
     * @return 入力画面のhtmlのパス
     */
    @RequestMapping("")
    public String index(){
        return "/exam02/exam02";
    }


}
