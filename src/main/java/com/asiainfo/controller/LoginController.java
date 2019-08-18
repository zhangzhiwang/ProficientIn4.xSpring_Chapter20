package com.asiainfo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest httpServletRequest) {
		String name = httpServletRequest.getParameter("name");
		String password = httpServletRequest.getParameter("password");
		System.out.println("name:" + name + ",password=" + password);
		
		httpServletRequest.getSession().setAttribute("userName", name);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("loginSuccess");
		return modelAndView;
	}
	
	@RequestMapping("/login2")
	public String login2(HttpServletRequest httpServletRequest) {
		String name = httpServletRequest.getParameter("name");
		String password = httpServletRequest.getParameter("password");
		System.out.println("name:" + name + ",password=" + password);
		
		httpServletRequest.getSession().setAttribute("userName", name);
		return "loginSuccess";
	}
}
