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
}
