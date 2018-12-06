package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.report.RankMapper;
import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Rank;
import com.lmq.service.report.RankService;
@Service
@Transactional
public class RankServiceImpl implements RankService {
	@Autowired
	RankMapper rm;
	@Override
	public List<Rank> querySalesPersonRank(Condition c) {
		// TODO Auto-generated method stub
		return rm.querySalesPersonRank(c);
	}

	@Override
	public List<Rank> queryCustomerRank(Condition c) {
		// TODO Auto-generated method stub
		return rm.queryCustomerRank(c);
	}

	@Override
	public List<Rank> queryGoodsRank(Condition c) {
		// TODO Auto-generated method stub
		return rm.queryGoodsRank(c);
	}

}
