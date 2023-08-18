package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
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

   @GetMapping("/login")
   public String login()
   {
        return "login";
   }
    
}