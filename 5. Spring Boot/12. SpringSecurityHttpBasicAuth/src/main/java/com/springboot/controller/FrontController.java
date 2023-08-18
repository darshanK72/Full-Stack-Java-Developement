package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/front")
public class FrontController {

    @GetMapping("/home")
    public String home()
    {
        return "home";
    }

    @GetMapping("/about")
    public String about()
    {
        return "about";
    }

    @GetMapping("/register")
    public String register()
    {
        return "register";
    }
    
}
