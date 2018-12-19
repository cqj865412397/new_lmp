/**
 * 
 */
package com.lmq.dao.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.SalesStock;

/**
 * @author TZX
 *销售统计
 */
public interface SalesStatisticsMapper {
	public List<SalesStock> query(Condition c);

	public List<SalesStock> queryDetail(Condition c);
	public double[] queryToday(Integer storeid); 
}
