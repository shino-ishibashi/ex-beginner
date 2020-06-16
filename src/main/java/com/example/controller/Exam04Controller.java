package com.example.controller;


import com.example.domain.User;
import com.example.form.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/ex04")
public class Exam04Controller {


    @ModelAttribute
    public UserForm setUp(){
        return new UserForm();
    }

    @RequestMapping("")
    public String index(){
        return "/exam04/exam04";
    }

    @RequestMapping("/get-user")
    public String getUser(
            @Validated UserForm userForm
            , BindingResult result
            , Model model
    ){

        if(result.hasErrors()){
            return index();
        }

        User user = new User();

        user.setName(userForm.getName());
        user.setAge(userForm.getAge());
        user.setComment(userForm.getComment());

        model.addAttribute("user", user);

        return "/exam04/exam04-result";
    }
}
