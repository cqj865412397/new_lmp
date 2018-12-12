package com.lmq.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.UserMapper;
import com.lmq.domain.User;
import com.lmq.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper mapper;
	@Override
	public User queryuser(User obj) {
		// TODO Auto-generated method stub
		return mapper.queryuser(obj);
	}

	
}
