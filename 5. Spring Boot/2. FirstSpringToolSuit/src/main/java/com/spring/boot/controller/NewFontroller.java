package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewFontroller {
	
	@GetMapping("/test")
	@ResponseBody
	public String test()
	{
		return "This is Sparta, This project is created using Spring Tool Suit";
	}
	
	@GetMapping("/")
	public String home()
	{
		System.out.println("Home Page");
		return "index";
	}
	


}
