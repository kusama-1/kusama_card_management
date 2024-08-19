package com.eba.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class cards {
    int card_id;
    String corporation;
    String name;
    String email;
    int tel;
    String address;
    String author;
    String memo;
    public cards(int card_id, String corporation, String name, String email, int tel, String address, String author,
            String memo) {
        this.card_id = card_id;
        this.corporation = corporation;
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.address = address;
        this.author = author;
        this.memo = memo;
    }

    
}
