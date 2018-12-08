package com.lmq.dao.report;

import java.util.List;

import com.lmq.domain.report.SalesStock;
/**
 * 进货统计
 * @author TZX
 *
 */
public interface PurchasingStatisticsMapper {
	public List<SalesStock> query();

	public List<SalesStock> queryDetail(Integer gid);
}
