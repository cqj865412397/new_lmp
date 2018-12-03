package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.PaytypeMapper;
import com.lmq.domain.Paytype;
import com.lmq.service.PayTypeService;
@Service
@Transactional
public class PayTypeServiceImpl implements PayTypeService{
	@Autowired
	PaytypeMapper pm;

	@Override
	public List<Paytype> queryAll() {
		// TODO Auto-generated method stub
		System.out.println(1);
		return pm.queryAll();
	}

}
