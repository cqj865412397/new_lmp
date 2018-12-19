package com.lmq.dao.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.SalesStock;
/**
 * 进货统计
 * @author TZX
 *
 */
public interface PurchasingStatisticsMapper {
	public List<SalesStock> query(Condition c);

	public List<SalesStock> queryDetail(Condition c);
}
