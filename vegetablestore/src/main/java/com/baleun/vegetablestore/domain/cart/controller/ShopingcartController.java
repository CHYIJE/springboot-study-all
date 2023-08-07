package com.baleun.vegetablestore.domain.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopingcartController {
    @GetMapping("/cart/shopingcart")
    public String shopingcart(){
    return "cart/shopingcart";
    }    
}
