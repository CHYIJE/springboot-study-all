package com.example.site2.domain.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {
    
    @GetMapping("/join")
    public String join(){

        return "auth/join";
    }


    @GetMapping("/login")
    public String login(HttpSession session){
        Object attribute = session.getAttribute("userIdx");

        Long idx = (Long) attribute;

        System.out.println("로그인페이지 idx : " + idx);

        return "auth/login";
    }
}  