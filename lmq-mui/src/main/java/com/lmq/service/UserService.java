package com.lmq.service;

import com.lmq.domain.User;

public interface UserService {

	 User queryuser(User obj);
	 
	 User queryuser1(User obj);
	 
	 int insertSelective(User obj);
	 
}
