package com.cg.projDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @RequestMapping("/")
    public String loginPage(){
        return "Login Page";
    }
}
