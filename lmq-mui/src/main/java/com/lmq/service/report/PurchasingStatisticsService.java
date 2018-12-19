package com.lmq.service.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.SalesStock;

public interface PurchasingStatisticsService {
	public List<SalesStock> query(Condition c);

	public List<SalesStock> queryDetail(Condition c);
}
