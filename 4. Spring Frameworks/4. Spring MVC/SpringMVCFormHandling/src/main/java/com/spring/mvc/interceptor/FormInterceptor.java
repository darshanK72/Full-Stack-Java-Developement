package com.spring.mvc.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.spring.mvc.models.User;

@SuppressWarnings("deprecation")
public class FormInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		PrintWriter writer = response.getWriter();
		
		System.out.println("Pre Handler");
		
		String userName = request.getParameter("firstName");
		
		if(userName.startsWith("M"))
		{
			writer.println("User Name cannot starts with M");
			return false;
		}
		
		return true;
		
	}

//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//			ModelAndView modelAndView) throws Exception {
//		return true;
//		
//	}
//
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//		return true;
//	}

}
