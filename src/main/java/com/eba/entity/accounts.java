package com.eba.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accounts")
public class accounts {
    @Id
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
