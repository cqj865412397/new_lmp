package com.lmq.service.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Profit;

public interface ProfitService {
	public List<Profit> queryByCustomer(Condition c);
	public List<Profit> queryByGoods(Condition c);
	public List<Profit> queryDetailBycid(Condition c);
	public List<Profit> queryDetailBygid(Condition c);
}
