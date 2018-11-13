package com.baizhi.controller;

import javax.servlet.http.HttpSession;

import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String register(User user){
		System.out.println(user);
		userService.register(user);
		return "redirect:/ems1.0/user/login.jsp";
	}
	
	@RequestMapping("/login")
	public String login(User user,HttpSession session){
		User login = userService.login(user);
		if(login!=null){
			session.setAttribute("login", login);
			return "redirect:/dept/showAllDept";
		}else{
			return "/user/login";
		}
		
		
	}
}
