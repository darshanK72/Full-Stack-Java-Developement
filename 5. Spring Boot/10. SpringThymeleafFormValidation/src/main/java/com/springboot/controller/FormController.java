package com.springboot.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.entity.User;

@Controller
public class FormController {

    @GetMapping("/register")
    public String registerForm(Model model)
    {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/details")
    public String userDetails(@Valid @ModelAttribute("user") User user,BindingResult bindingResult,Model model)
    {
        if(bindingResult.hasErrors())
        {
            System.out.println(bindingResult);
            return "register";
        }
        System.out.println(user);
        return "details";
    }
    
}
