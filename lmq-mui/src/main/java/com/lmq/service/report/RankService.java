package com.lmq.service.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Rank;

public interface RankService {
	//排名
	List<Rank> querySalesPersonRank(Condition c);
	List<Rank> queryCustomerRank(Condition c);
	List<Rank> queryGoodsRank(Condition c);
	//折线统计图
	List<Rank> queryChartIncome(Condition c);
	List<Rank> queryChartProfit(Condition c);
	List<Rank> queryChartExpenses(Condition c);
	List<Rank> getFirstCustomeridSupplier(Condition c);
}
