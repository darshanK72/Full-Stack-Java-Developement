package com.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {
	
	
	@GetMapping("/home")
	public String home(Model model)
	{	
		System.out.println("Hello World");
		model.addAttribute("firstName", "Darshan");
		model.addAttribute("lastName","Khairnar");
		List<String> stringList = new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Pineapple");
		model.addAttribute("time", new Date());
		model.addAttribute("stringList",stringList);
		model.addAttribute("gender","F");
		return "home";
	}
}
