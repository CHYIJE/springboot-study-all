package com.example.site2.domain.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.site2.domain.main.dto.ResMainDTO;
import com.example.site2.domain.main.service.MainService;

@Controller
public class MainController { 

    @Autowired
    private MainService mainService;

    // @GetMapping("/") // 밑의 주소랑 별개임 (유저에게 받는 주소)
    // public String mainPage(){
        // mainService
        // return "main";
    // } // 문자로 받고 
// 
    // @GetMapping("/") // 밑의 주소랑 별개임 (유저에게 받는 주소)
    // public ModelAndView mainPage(){
        // ModelAndView modelAndView = new ModelAndView();
        // modelAndView.setViewName("main"); //templates 하위 파일 주소작성
        // return modelAndView;
    // }    // 모델로 받고 
// 
// }


    // @GetMapping("/")
    // public String mainPage1(Model model){
        // ResMainDTO dto = mainService.getMainData();        
        // model.addAttribute("dto", dto);
        // return "main";
    // }

    @GetMapping("/")
    public ModelAndView mainPage(){
        ModelAndView modelAndView = new ModelAndView();
        ResMainDTO dto = mainService.getMainData();
        modelAndView.addObject("dto", dto);
        modelAndView.setViewName("main");
        return modelAndView;
    }
}

// 하위 둘중 하나만 씀