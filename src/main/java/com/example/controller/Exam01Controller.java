package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {


    /**
     * 入力画面に移動するためのメソッド
     * @return 表示するviewを返す
     */
    @RequestMapping("")
    public String index(){
        return "exam01";
    }

    /**
     *
     * @param name formで入力された名前の変数
     * @param model requestスコープに格納するためのオブジェクト
     * @return  受け取った名前を出力するviewに遷移するためのメソッド
     */
    @RequestMapping("/get-name")
    public String getName(String name , Model model){
        model.addAttribute("name",name);
        return "exam01-result";
    }

}
