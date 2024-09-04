package com.eba.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cards")
public class cards {
    @Id
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
