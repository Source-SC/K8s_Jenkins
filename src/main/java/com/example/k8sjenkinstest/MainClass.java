package com.example.k8sjenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainClass {
    @GetMapping("/")
    public String DemoRestApi(){
        return "HI, I'm demo application";
    }
}
