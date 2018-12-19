package com.lmq.dao.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Profit;
/**
 * 利润统计
 * @author TZX
 *
 */
public interface ProfitMapper {
	public List<Profit> queryByCustomer(Condition c);
	public List<Profit> queryByGoods(Condition c);
	public List<Profit> queryDetailBycid(Condition c);
	public List<Profit> queryDetailBygid(Condition c);
	
}
