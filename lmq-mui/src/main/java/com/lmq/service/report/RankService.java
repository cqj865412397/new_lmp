package com.lmq.service.report;

import java.util.List;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Rank;

public interface RankService {
	List<Rank> querySalesPersonRank(Condition c);
	List<Rank> queryCustomerRank(Condition c);
	List<Rank> queryGoodsRank(Condition c);
}
