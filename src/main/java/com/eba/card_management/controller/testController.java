package com.eba.card_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class testController {
    @RequestMapping(value = "/testpage" , method = RequestMethod.GET) //URLを指定
    public String testpage() {
        return "testpage.html"; //ここでreturnする文字と同じ名前のHTMLが呼ばれる
    }
    
}
