package com.lmq.service.report;

import java.util.List;

import com.lmq.domain.report.SalesStock;

public interface SalesStatisticsService {
	public List<SalesStock> query();

	public List<SalesStock> queryDetail(Integer gid);
}
