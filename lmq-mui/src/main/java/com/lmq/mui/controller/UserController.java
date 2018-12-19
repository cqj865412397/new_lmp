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
	public User queryuser(User obj) {
		 User user=users.queryuser(obj);
		return user;
	 }
	@RequestMapping("queryuser1")
	public User queryuser1(User obj) {
		 User user=users.queryuser1(obj);
		 return user;
	 }
	
	@RequestMapping("insertSelective")
	public int insertSelective(User obj) {
		 int user=users.insertSelective(obj);
		 return user;
	 }
	
	
}
