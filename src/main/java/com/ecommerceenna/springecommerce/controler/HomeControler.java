package com.ecommerceenna.springecommerce.controler;

import com.ecommerceenna.springecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeControler {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public String home(Model model){
        model.addAttribute("productos", productoService.findAll());
        return "usuario/home";
    }
}