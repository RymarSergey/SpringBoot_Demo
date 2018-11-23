package com.example.demo;/*
 *
 *autor Sergey on 23.11.2018 17:30
 */

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String name;


}
