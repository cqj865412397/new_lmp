package com.lmq.service.imp;

import java.util.List;
import com.lmq.domain.Storetype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.StoretypeMapper;
import com.lmq.service.Storetypeservice;
@Service
@Transactional
public class StoretypeServiceimpl implements Storetypeservice{

	@Autowired
	StoretypeMapper s;
	@Override
	public List<Storetype> Storetype(Integer User1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Storetype> queryBylevel(Storetype obj) {
		// TODO Auto-generated method stub
		return s.queryBylevel(obj);
	}

	

	

}
