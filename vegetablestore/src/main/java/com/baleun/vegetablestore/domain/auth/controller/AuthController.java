package com.baleun.vegetablestore.domain.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    
    @GetMapping("/auth/login")
    public String login(){
        return "auth/login";
    }

    @GetMapping("/auth/join")
    public String join(){
        return "auth/join";
    }

    
}
