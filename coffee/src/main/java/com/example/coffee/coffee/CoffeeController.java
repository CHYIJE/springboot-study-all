package com.example.coffee.coffee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {
     @GetMapping("/coffee")
    public ModelAndView first(){
        // this는 클래스로 만든 인스턴스 - 자기자신
        System.out.println(this);

        // 출력할 화면과 데이터를 세팅하는 객체
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("coffee", "Americano"); 
        modelAndView.setViewName("coffee");

        return modelAndView;
    }
}
