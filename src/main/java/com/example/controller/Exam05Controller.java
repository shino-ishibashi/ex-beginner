package com.example.controller;

import com.example.domain.Member;
import com.example.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ex05")
public class Exam05Controller {

    @Autowired
    private MemberService service;

    @RequestMapping("")
    public String index() {
        return "/exam05/exam05";
    }

    @RequestMapping("get-result")
    public String getResult(String partOfName, Model model) {
        List<Member> memberList = service.findByPartOfName(partOfName);
        model.addAttribute("memberList",memberList);
        return "/exam05/exam05-result";
    }

}
