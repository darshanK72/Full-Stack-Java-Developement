package com.springboot.first.firstapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@GetMapping("/home")
	@ResponseBody
	public String home()
	{
		System.out.println("From Home Controller");
		return "This is Home Page ,This project is created by Spring Initilizr";
	}

}
