package com.example.spring_security_csrf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/insert")
    public String insert(){
        System.out.println("IN POST");
        return "index";
    }
}
