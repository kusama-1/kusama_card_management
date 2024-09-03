package com.eba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class cards {
    private int card_id;
    private String corporation;
    private String name;
    private String email;
    private String tel;
    private String address;
    private String author;
    private String memo;
    private String front_image_path;
    private String back_image_path;   
}
