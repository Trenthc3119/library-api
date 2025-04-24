package com.yanch.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, Library!";
    }


    @GetMapping("/time")
    public String time(){
        //return current time
        return "Current time is: " + LocalDateTime.now();
    }

}
