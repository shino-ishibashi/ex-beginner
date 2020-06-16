package com.example.controller;


import com.example.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/ex06")
public class ShoppingCartController {

    @Autowired
    private ServletContext application;

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index(){
        Item item = new Item();
        item.setName("手帳ノート");
        item.setPrice(1000);
        Item item2 = new Item();
        item2.setName("文房具セット");
        item2.setPrice(1500);
        Item item3 = new Item();
        item3.setName("ファイル");
        item3.setPrice(2000);
        List<Item> itemList = new LinkedList();

        itemList.add(item);
        itemList.add(item2);
        itemList.add(item3);

        application.setAttribute("itemList", itemList);

        return "/exam06/item-and-cart";
    }

    @RequestMapping("/in-cart/{index}")
    public String inCart(@PathVariable ("index") String index) {
        List<Item> inCartList;
        List<Item> itemList = (List<Item>)application.getAttribute("itemList");

        if(Objects.isNull((LinkedList<Item>) session.getAttribute("inCartList"))){
            inCartList = new LinkedList<>();
        }else {
            inCartList = (LinkedList<Item>) session.getAttribute("inCartList");
        }

        inCartList.add(itemList.get(Integer.parseInt(index)));
        session.setAttribute("inCartList",inCartList);

        return index();
    }

    @RequestMapping("/delete/{index}")
    public String delete(@PathVariable ("index") String index) {
        List<Item> inCartList = new LinkedList<>();
        inCartList = (List<Item>) session.getAttribute("inCartList");
        inCartList.remove(Integer.parseInt(index));
        session.setAttribute("inCartList",inCartList);
        return index();
    }
}
