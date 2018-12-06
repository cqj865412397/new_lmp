package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.report.SalesStock;
import com.lmq.service.report.SalesStatisticsService;

@RestController
public class SalesStatisticsController {
	@Autowired
	SalesStatisticsService ss;
	@RequestMapping("SalesStatistics")
	public List<SalesStock> SalesStatistics() {
		System.out.println("查询销售：");
		return ss.query();
	}
	@RequestMapping("SalesStatisticsDetail")
	public List<SalesStock> SalesStatisticsDetail(Integer gid) {
		System.out.println("查询销售详情："+gid);
		return ss.queryDetail(gid);
	}
}
