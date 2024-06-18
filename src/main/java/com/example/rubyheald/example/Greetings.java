package com.example.rubyheald.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Greetings {
    @RequestMapping("/")
    public String Greeter(){
        return "Hello Ruby";
    }
}


