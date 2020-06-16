package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {

    @Autowired
    private HttpSession session;

    /**
     * 入力画面にフォワードするメソッド
     * @return 入力画面のhtmlのパス
     */
    @RequestMapping("")
    public String index(){
        return "/exam02/exam02";
    }


    /**
     * 足し算の計算結果をフォワードするメソッド
     *
     * @param num1 計算される数値
     * @param num2 計算される数値
     * @return result画面のパス
     */
    @RequestMapping("/addition")
    public String addition(Integer num1, Integer num2){
        Integer addAnswer = num1 + num2;
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("addAnswer", addAnswer);
        return "exam02/exam02-result";
    }

    @RequestMapping("/toResult")
    public String toPage(){
        return "exam02/exam02-result";
    }

    @RequestMapping("/toResult2")
    public String toPage2(){
        return "exam02/exam02-result2";
    }
}
