package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.report.PurchasingStatisticsMapper;
import com.lmq.domain.report.SalesStock;
import com.lmq.service.report.PurchasingStatisticsService;

@Service
public class PurchasingStatisticsServiceImpl implements PurchasingStatisticsService {
	@Autowired
	PurchasingStatisticsMapper mapper;
	@Override
	public List<SalesStock> query() {
		// TODO Auto-generated method stub
		return mapper.query();
	}

	@Override
	public List<SalesStock> queryDetail(Integer gid) {
		// TODO Auto-generated method stub
		return mapper.queryDetail(gid);
	}
	
}
