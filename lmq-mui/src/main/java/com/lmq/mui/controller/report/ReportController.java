package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Profit;
import com.lmq.service.report.ProfitService;

@RestController
public class ReportController {
	@Autowired
	ProfitService profitService;
	@RequestMapping("/profitCustomer")
	public List<Profit> profitCustomer(Condition c) {	//对象传入
		System.out.println("利润查询-顾客"+c.getDate()+"-"+c.getStartdate()+"-"+c.getEnddate());
		System.out.println(JSON.toJSONString(c));
		return profitService.queryByCustomer(c);
	}
	@RequestMapping("/profitGoods")
	public List<Profit> profitGoods(@RequestBody Condition c) {	//复杂参数传入
		System.out.println("利润查询-商品"+c.getDate()+"-"+c.getStartdate()+"-"+c.getEnddate());
		return profitService.queryByGoods(c);
	}
	@RequestMapping("/profitDetail")
	public List<Profit> profitDetail(Condition c) {
		System.out.println("利润详情-"+c.getCustomer()+"-"+c.getStartdate()+"-"+c.getGoodsid());
		if(c.getCustomer()!=null&&c.getCustomer()>0) {
			System.out.println("查询利润：客户");
			return profitService.queryDetailBycid(c);
		}else {
			System.out.println("查询利润：商品");
			return profitService.queryDetailBygid(c);
		}
	}
}
