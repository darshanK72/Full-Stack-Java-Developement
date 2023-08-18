package com.spring.mvc.controllers;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring.mvc.models.User;
import com.spring.mvc.services.UserService;

@Controller
public class FormController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("register")
	public String register()
	{
		return "register";
	}
	
//	@RequestMapping(path="about",method=RequestMethod.POST)
//	public String about(
//			@RequestParam("firstName") String firstName,
//			@RequestParam("lastName") String lastName,
//			@RequestParam("email") String email,
//			@RequestParam("password") String password,
//			Model model)
//	{
//		Map<String,String> map = new HashMap<String, String>();
//		map.put("firstName", firstName);
//		map.put("lastName", lastName);
//		map.put("email", email);
//		map.put("password",password);
//		
//		model.addAllAttributes(map);
//		
//		return "about";
//	}
	
	@RequestMapping(path="about",method=RequestMethod.POST)
	public String about(@ModelAttribute("user") User user,BindingResult result,Model model)
	{
		try
		{
			if(result.hasErrors())
			{
				return "register";
			}
			this.userService.createUser(user);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return "about";
	}
	
	@RequestMapping("/page1")
	public String page1()
	{
		return "redirect:/page2";
	}
	
	@RequestMapping("/page2")
	public String about()
	{
		return "about";
	}
	
}
