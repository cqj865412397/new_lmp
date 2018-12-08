package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Rank;
import com.lmq.service.report.RankService;

@RestController
public class RankController {
	@Autowired
	RankService rs;
	@RequestMapping("/salesPersonRank")
	public List<Rank> salesPersonRank(Condition c) {
		System.out.println("营业员统计");
		return rs.querySalesPersonRank(c);
	}
	@RequestMapping("/customerRank")
	public List<Rank> customerRank(Condition c) {
		System.out.println("顾客销售排名");
		return rs.queryCustomerRank(c);
	}
	@RequestMapping("/goodsRank")
	public List<Rank> goodsRank(Condition c) {
		System.out.println("货品销售排名");
		return rs.queryGoodsRank(c);
	}
}
