package com.example.demo;/*
 *
 *autor Sergey on 23.11.2018 16:53
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
//Вазвращать массив в формате JSON
@RestController
public class HelloController {
    @GetMapping("/hello")
    public List<String> sayHello(){
        return Arrays.asList("Hello","Seryi!");
    }
}
