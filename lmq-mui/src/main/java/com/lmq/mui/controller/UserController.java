package com.lmq.mui.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.User;
import com.lmq.service.UserService;

@RestController
@RequestMapping("User")
public class UserController {
	@Autowired
	UserService users;
	@RequestMapping("queryuser")
	public User queryuser(User obj,HttpSession session) {
		 User user=users.queryuser(obj);
		 if (user!=null) {
			 session.setAttribute("user",user);
			 System.out.println(user);
			 return user;
		 }
		 return null;
	 }
	
	
}
