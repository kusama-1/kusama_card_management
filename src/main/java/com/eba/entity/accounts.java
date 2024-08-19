package com.eba.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class accounts {

    private int loginId;
    private String password;

    public accounts(int l,String p){
        this.loginId=l;
        this.password=p;
    }

    // public void setLoginId(int loginId) {
    //     this.loginId = loginId;
    // }
    // public void setPassword(String password) {
    //     this.password = password;
    // }

    // public int getLoginId(){
    //     return loginId;
    // }

    // public String getPassword(){
    //     return password;
    // }

}
