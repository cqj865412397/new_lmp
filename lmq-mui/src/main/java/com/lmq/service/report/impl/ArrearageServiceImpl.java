package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.report.ArrearageMapper;
import com.lmq.domain.report.Arrearage;
import com.lmq.domain.report.Condition;
import com.lmq.service.report.ArrearageService;
@Service
@Transactional
public class ArrearageServiceImpl implements ArrearageService {
	@Autowired
	ArrearageMapper mapper;
	@Override
	public List<Arrearage> queryReceipt(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryReceipt(c);
	}

	@Override
	public List<Arrearage> queryReceiptDetail(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryReceiptDetail(c);
	}

	@Override
	public List<Arrearage> queryPay(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryPay(c);
	}

	@Override
	public List<Arrearage> queryPayDetail(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryPayDetail(c);
	}
	
}
