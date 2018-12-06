package com.lmq.service.report;

import java.util.List;

import com.lmq.domain.report.Profit;

public interface ProfitService {
	public List<Profit> queryByCustomer();
	public List<Profit> queryByGoods();
	public List<Profit> queryDetailBycid(Integer cid);
	public List<Profit> queryDetailBygid(Integer gid);
}
