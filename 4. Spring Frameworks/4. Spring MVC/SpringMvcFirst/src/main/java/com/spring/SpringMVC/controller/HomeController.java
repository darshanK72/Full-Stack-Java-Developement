package com.spring.SpringMVC.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name","Darshan Khairnar");
		model.addAttribute("age",21);
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Prasad");
		friends.add("Aakash");
		friends.add("Krushna");
		friends.add("Abhishek");
		model.addAttribute("friends",friends);
		return "home";
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("user","Darshan Khairnar");
		modelView.setViewName("about");
		return modelView;
		
	}
}
