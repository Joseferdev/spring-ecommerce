package com.ecommerceenna.springecommerce.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoControler {

    @GetMapping("")
    public String show(){
        return "productos/show";
    }
}
