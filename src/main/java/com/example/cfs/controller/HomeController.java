package com.example.cfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/humanresources")
    public String hr(){
        return "humanresources";
    }
}
