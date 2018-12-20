package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.report.StockStatisticsMapper;
import com.lmq.domain.report.Condition;
import com.lmq.domain.report.StockStatistics;
import com.lmq.domain.report.StockWarning;
import com.lmq.service.report.StockStatisticsService;
@Service
@Transactional
public class StockStatisticsServiceImpl implements StockStatisticsService {
	@Autowired
	StockStatisticsMapper sm;

	@Override
	public List<StockStatistics> queryAll(Condition c) {
		// TODO Auto-generated method stub
		return sm.queryAll(c);
	}

	@Override
	public StockStatistics queryDetail(Condition c) {
		// TODO Auto-generated method stub
		return sm.queryDetail(c);
	}

	@Override
	public List<StockWarning> queryWaring(Condition c) {
		// TODO Auto-generated method stub
		return sm.queryWarning(c);
	}
	
}
