package com.lmq.dao.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.StockStatistics;
import com.lmq.domain.report.StockWarning;

public interface StockStatisticsMapper {
	public List<StockStatistics> queryAll(Condition c);	//门店id:storeid 时间段：
	public StockStatistics queryDetail(Condition c);	//商品实例id:goodsid;时间段：
	public List<StockWarning> queryWarning(Condition c);	//无用户手动设置的筛选条件--门店id:storeid
}
