package com.example.rubyheald.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class GreetingController {
    @RequestMapping (value = "/greeting")
    public String getGreeting(){
        return "Welcome Ruby";
    }
}
