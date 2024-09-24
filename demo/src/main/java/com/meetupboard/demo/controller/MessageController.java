package com.meetupboard.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @GetMapping("/{hello}")
    public String getMessage() {
        System.out.println("Hello World!");
        List<String> stringList = new ArrayList<String>();
        return "Hello World!";
    }
    
    
}
