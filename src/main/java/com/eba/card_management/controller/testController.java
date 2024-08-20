package com.eba.card_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.eba.dao.accountsDAO;
import com.eba.entity.accounts;



@Controller
public class testController {
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
    public String loginJudge(@ModelAttribute accounts accounts,Model model){
    //@ModelAttributeで、login.htmlで入力された値をspringがaccountsのフィールドに自動で割り当ててくれる
        if (1 == accounts.getLoginId() && "password".equals(accounts.getPassword())) {
            accountsDAO accountsDAO=new accountsDAO();
            model.addAttribute(accountsDAO);
            return "summary.html"; //一覧ページを表示する
        }else{
        return "login.html"; //戻る
        }
    }
}
