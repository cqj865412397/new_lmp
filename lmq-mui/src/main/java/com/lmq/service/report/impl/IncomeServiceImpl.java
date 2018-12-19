package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.report.IncomeMapper;
import com.lmq.domain.report.AllIncome;
import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Income;
import com.lmq.service.report.IncomeService;
@Service
@Transactional
public class IncomeServiceImpl implements IncomeService {
	@Autowired
	IncomeMapper mapper;
	@Override
	public AllIncome queryAll(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryAll(c);
	}

	@Override
	public List<Income> queryXS(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryXS(c);
	}

	@Override
	public List<Income> querySK(Condition c) {
		// TODO Auto-generated method stub
		return mapper.querySK(c);
	}

	@Override
	public List<Income> queryJH(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryJH(c);
	}

	@Override
	public List<Income> queryFK(Condition c) {
		// TODO Auto-generated method stub
		return mapper.queryFK(c);
	}
	
}
