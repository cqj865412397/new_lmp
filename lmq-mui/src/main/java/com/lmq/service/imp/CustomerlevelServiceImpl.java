package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.CustomerlevelMapper;
import com.lmq.domain.Customerlevel;
import com.lmq.service.CustomerService;
import com.lmq.service.CustomerlevelService;
@Service
@Transactional
public class CustomerlevelServiceImpl implements CustomerlevelService{
	@Autowired
	CustomerlevelMapper mapper;
	@Override
	public List<Customerlevel> queryCustomerlevelBySid(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.queryCustomerlevelBySid(sid);
	}

}
