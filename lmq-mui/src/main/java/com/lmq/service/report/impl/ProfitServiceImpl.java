package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.report.ProfitMapper;
import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Profit;
import com.lmq.service.report.ProfitService;
@Service
@Transactional
public class ProfitServiceImpl implements ProfitService {
	@Autowired
	ProfitMapper mapper;

	@Override
	public List<Profit> queryByCustomer(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryByCustomer(c);
	}

	@Override
	public List<Profit> queryByGoods(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryByGoods(c);
	}

	@Override
	public List<Profit> queryDetailBycid(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryDetailBycid(c);
	}

	@Override
	public List<Profit> queryDetailBygid(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryDetailBygid(c);
	}
}
