package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.report.ProfitMapper;
import com.lmq.domain.report.Profit;
import com.lmq.service.report.ProfitService;
@Service
@Transactional
public class ProfitServiceImpl implements ProfitService {
	@Autowired
	ProfitMapper mapper;

	@Override
	public List<Profit> queryByCustomer() {
		// TODO Auto-generated method stub
		return mapper.queryByCustomer();
	}

	@Override
	public List<Profit> queryByGoods() {
		// TODO Auto-generated method stub
		return mapper.queryByGoods();
	}

	@Override
	public List<Profit> queryDetailBycid(Integer cid) {
		// TODO Auto-generated method stub
		return mapper.queryDetailBycid(cid);
	}

	@Override
	public List<Profit> queryDetailBygid(Integer gid) {
		// TODO Auto-generated method stub
		return mapper.queryDetailBygid(gid);
	}
}
