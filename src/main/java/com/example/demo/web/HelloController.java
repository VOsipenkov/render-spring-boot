package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @Value("${application.message}")
    private String message;

    @GetMapping("/hello")
    public String hello(){
        return message;
    }
} 