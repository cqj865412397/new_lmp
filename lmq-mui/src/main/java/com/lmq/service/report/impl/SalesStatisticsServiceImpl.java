package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.report.SalesStatisticsMapper;
import com.lmq.domain.report.Condition;
import com.lmq.domain.report.SalesStock;
import com.lmq.service.report.SalesStatisticsService;
@Service
@Transactional
public class SalesStatisticsServiceImpl implements SalesStatisticsService {
	@Autowired
	SalesStatisticsMapper sm;
	
	@Override
	public List<SalesStock> query(Condition c) {
		// TODO Auto-generated method stub
		return sm.query(c);
	}

	@Override
	public List<SalesStock> queryDetail(Condition c) {
		// TODO Auto-generated method stub
		return sm.queryDetail(c);
	}

	@Override
	public double[] queryToday(Integer storeid) {
		// TODO Auto-generated method stub
		return sm.queryToday(storeid);
	}

}
