package com.eba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class accounts {
    
    private int loginId;
    private String password;

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
