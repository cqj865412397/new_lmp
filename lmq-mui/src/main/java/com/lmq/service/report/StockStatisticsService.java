package com.lmq.service.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.StockStatistics;
import com.lmq.domain.report.StockWarning;

public interface StockStatisticsService {
	public List<StockStatistics> queryAll(Condition c);
	public StockStatistics queryDetail(Condition c);
	public List<StockWarning> queryWaring(Condition c);	//无用户手动设置的筛选条件
}
