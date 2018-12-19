package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.report.Condition;
import com.lmq.domain.report.SalesStock;
import com.lmq.service.report.PurchasingStatisticsService;

@RestController
public class purchasingStatisticsController {
	@Autowired
	PurchasingStatisticsService ps;
	@RequestMapping("purchasingStatistics")
	public List<SalesStock> purchasingStatistics(Condition c) {
		System.out.println("查询进货：");
		return ps.query(c);
	}
	@RequestMapping("purchasingStatisticsDetail")
	public List<SalesStock> purchasingStatisticsDetail(Condition c) {
		System.out.println("查询进货详情："+c.getGoodsid());
		return ps.queryDetail(c);
	}
}
