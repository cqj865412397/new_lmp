package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.lmq.domain.report.Condition;
import com.lmq.domain.report.SalesStock;
import com.lmq.service.report.SalesStatisticsService;

@RestController
public class SalesStatisticsController {
	@Autowired
	SalesStatisticsService ss;
	@RequestMapping("SalesStatistics")
	public List<SalesStock> SalesStatistics(Condition c) {
		System.out.println("查询销售："+JSON.toJSONString(c));
		return ss.query(c);
	}
	@RequestMapping("SalesStatisticsDetail")
	public List<SalesStock> SalesStatisticsDetail(Condition c) {
		System.out.println("查询销售详情："+c.getGoodsid());
		return ss.queryDetail(c);
	}
	/**
	 * 首页显示1今日销量、2本月销量、3库存,返回double[]类型数组
	 * @param storeid
	 * @return
	 */
	@RequestMapping("todaySales")
	public double[] queryToday(Integer storeid) {
		System.out.println(JSON.toJSONString(ss.queryToday(storeid)));
		return ss.queryToday(storeid);
	}
}
