package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.StoreMapper;
import com.lmq.domain.Store;
import com.lmq.service.StoreService;
@Service
@Transactional
public class StoreServiceImpl implements StoreService{
	@Autowired
	StoreMapper mapper;
	@Override
	public List<Store> queryByUserId(Integer id) {
		// TODO Auto-generated method stub
		return mapper.queryByUserId(id);
	}

}
