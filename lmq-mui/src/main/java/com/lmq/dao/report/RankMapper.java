package com.lmq.dao.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Rank;

public interface RankMapper {
	//营业员统计
	List<Rank> querySalesPersonRank(Condition c);
	//客户销售排名
	List<Rank> queryCustomerRank(Condition c);
	//货品销售排名
	List<Rank> queryGoodsRank(Condition c);
	
	//销售收入-折线统计图
	List<Rank> queryChartIncome(Condition c);
	//销售成本-折线统计图
	List<Rank> queryChartProfit(Condition c);
	//经营费用-折线统计图
	List<Rank> queryChartExpenses(Condition c);
	/**
	 * 获取第一个顾客和供应商-共2条数据，每条2列：id,name
	 * @param c
	 * @return Rank:id-顾客id/name-顾客name/id-供应商id/name-供应商name
	 */
	List<Rank> getFirstCustomeridSupplier(Condition c);
}
