package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.report.IncomeMapper;
import com.lmq.domain.report.AllIncome;
import com.lmq.domain.report.Income;
import com.lmq.service.report.IncomeService;
@Service
@Transactional
public class IncomeServiceImpl implements IncomeService {
	@Autowired
	IncomeMapper mapper;
	@Override
	public AllIncome queryAll() {
		// TODO Auto-generated method stub
		return mapper.queryAll();
	}

	@Override
	public List<Income> queryXS() {
		// TODO Auto-generated method stub
		return mapper.queryXS();
	}

	@Override
	public List<Income> querySK() {
		// TODO Auto-generated method stub
		return mapper.querySK();
	}

	@Override
	public List<Income> queryJH() {
		// TODO Auto-generated method stub
		return mapper.queryJH();
	}

	@Override
	public List<Income> queryFK() {
		// TODO Auto-generated method stub
		return mapper.queryFK();
	}
	
}
