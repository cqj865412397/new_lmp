package com.lmq.mui.controller.report;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.lmq.domain.report.Condition;
import com.lmq.domain.report.StockStatistics;
import com.lmq.domain.report.StockStatisticsDetail;
import com.lmq.domain.report.StockWarning;
import com.lmq.service.report.StockStatisticsService;

/**
 * 库存统计与预警
 * @author TZX
 *
 */
@RestController
public class StockStatisticsController {
	@Autowired
	StockStatisticsService ss;
	@RequestMapping("/stockstatistics")
	public List<StockStatistics> stockstatistics(HttpSession session,Condition c){
		System.out.println("库存");
		System.out.println(JSON.toJSONString(c));
		return ss.queryAll(c);
	}
	@RequestMapping("/stockstatisticsDetail")
	public StockStatistics stockstatisticsDetail(Condition c){
		System.out.println("库存详情");
		return ss.queryDetail(c);
	}
	@RequestMapping("/stockWarning")
	public List<StockWarning> stockWarning(HttpSession session,Condition c){
		return ss.queryWaring(c);	//门店id
	}
}
