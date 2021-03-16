package com.example.Switeer.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "swetter_database")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String text;
    private String tag;

    public Message(String text, String tag){
        this.text = text;
        this.tag = tag;
    }
}
