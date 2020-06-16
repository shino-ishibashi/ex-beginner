package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserForm {
    @NotBlank(message = "名前が空欄です")
    private String name;

    @NotBlank(message = "年齢が空欄です")
    @Pattern(regexp = "[0-9]+")
    private String age;

    @NotBlank(message = "コメントが空欄です")
    private String comment;


    //    getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
