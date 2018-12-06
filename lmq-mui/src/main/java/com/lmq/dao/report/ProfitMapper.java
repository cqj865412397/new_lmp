package com.lmq.dao.report;

import java.util.List;

import com.lmq.domain.report.Profit;
/**
 * 利润统计
 * @author TZX
 *
 */
public interface ProfitMapper {
	public List<Profit> queryByCustomer();
	public List<Profit> queryByGoods();
	public List<Profit> queryDetailBycid(Integer cid);
	public List<Profit> queryDetailBygid(Integer gid);
	
}
