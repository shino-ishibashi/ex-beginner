package com.example.controller;


import com.example.domain.ProductsPrice;
import com.example.form.Exam03Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

    @Autowired
    private ServletContext application;

    @ModelAttribute
    public Exam03Form setUp(){
        return new Exam03Form();
    }

    @RequestMapping("")
    public String index(){
        return "/exam03/exam03";
    }

    @RequestMapping("sum-price")
    public String sumPrice(Exam03Form form){
        ProductsPrice productsPrice = new ProductsPrice();
        productsPrice.setProduct1Price(form.getProduct1Price());
        productsPrice.setProduct2Price(form.getProduct2Price());
        productsPrice.setProduct3Price(form.getProduct3Price());
        Integer sum = form.getProduct1Price() + form.getProduct2Price() + form.getProduct3Price();
        productsPrice.setProductSumPrice(sum);
        productsPrice.setProductSumPriceIncludeTax((int) (sum * 1.1));
        application.setAttribute("productsPrice", productsPrice);
        return "/exam03/exam03-result";
    }
}
