package com.eba.card_management.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.jdbc.core.JdbcTemplate;


import com.eba.entity.accounts;
import com.eba.entity.cards;

@Controller
public class testController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String testpage() {
        return "login.html"; //ここでreturnする文字と同じ名前のHTMLが呼ばれる
    }
    
    //DBの情報と照合し、loginIdとpasswordが一致しているか判定

    
    //ログインに成功したら一覧ページを表示する
    // @PostMapping("/summary")
    // public String loginJudge(@RequestParam String loginId,@RequestParam String password,Model model){
    //     model.addAttribute("loginId",loginId);
    //     model.addAttribute("password",password);

    //     return "summary.html"; //一覧ページを表示する
    // }
    
    
    @PostMapping("/summary")
    public String loginJudge(Model model){
    //@ModelAttributeで、login.htmlで入力された値をspringがaccountsのフィールドに自動で割り当ててくれる
    //     if (1 == accounts.getLoginId() && "password".equals(accounts.getPassword())) {
             model.addAttribute(new accounts());
             model.addAttribute(new cards());
        String sql = "select + from cards";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        model.addAllAttributes(list);
            return "summary.html"; //一覧ページを表示する
    //     }else{
    //      return "login.html"; //戻る
    //     }
    }

    @PostMapping("/upload")
    public String upload(@ModelAttribute cards cards,Model model){
        return "upload.html";
    }

    @GetMapping("/uploadSuccess")
    public String uploadSuccess(@ModelAttribute accounts accounts,Model model){
        return "uploadSuccess.html";
    }
}
