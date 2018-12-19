package com.lmq.service.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.SalesStock;

public interface SalesStatisticsService {
	public List<SalesStock> query(Condition c);

	public List<SalesStock> queryDetail(Condition c);
	/**
	 * 首页显示今日销量、本月销量、库存,返回double[]类型数组
	 * @param storeid
	 * @return
	 */
	public double[] queryToday(Integer storeid); 
}
