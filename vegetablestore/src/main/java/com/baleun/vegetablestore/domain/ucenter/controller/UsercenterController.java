package com.baleun.vegetablestore.domain.ucenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsercenterController {
    @GetMapping("/ucenter/usercenter")
    public String usercenter(){
    return "ucenter/usercenter";
    }
}

