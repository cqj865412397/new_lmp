package com.lmq.mui.controller.report;

import java.util.Date;
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
	@RequestMapping("/chartIncome")
	public List<Rank> chartIncome(Condition c) {
		System.out.println("销售收入-折线图数据");
		System.out.println(c.getStartdate()+"\n"+c.getEnddate());
		return rs.queryChartIncome(c);
	}
	@RequestMapping("/chartProfit")
	public List<Rank> chartProfit(Condition c) {
		System.out.println("销售成本-折线图数据");
		return rs.queryChartProfit(c);
	}
	@RequestMapping("/chartExpenses")
	public List<Rank> chartExpenses(Condition c) {
		System.out.println("经营费用-折线图数据");
		return rs.queryChartExpenses(c);
	}
	@RequestMapping("/getFirstCustomeridSupplier")
	public List<Rank> getFirstCustomeridSupplier(Condition c) {
		System.out.println("获取第一个顾客和供应商");//id-顾客id/name-顾客name/name-供应商id/name-供应商name--2条
		return rs.getFirstCustomeridSupplier(c);
	}
}
