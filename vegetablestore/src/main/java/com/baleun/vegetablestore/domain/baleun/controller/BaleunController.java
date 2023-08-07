package com.baleun.vegetablestore.domain.baleun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BaleunController {
    
    @GetMapping("/")
    public ModelAndView baleunPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("baleun");
        return modelAndView;
    }
    
}
