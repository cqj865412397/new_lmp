package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.report.Profit;
import com.lmq.service.report.ProfitService;

@RestController
public class ReportController {
	@Autowired
	ProfitService profitService;
	@RequestMapping("profitCustomer")
	public List<Profit> profitCustomer() {
		System.out.println("进入contrller");
		return profitService.queryByCustomer();
	}
	@RequestMapping("profitGoods")
	public List<Profit> profitGoods() {
		System.out.println("进入contrller");
		return profitService.queryByGoods();
	}
	@RequestMapping("profitDetail")
	public List<Profit> profitDetail(Integer cid,Integer gid) {
		System.out.println("进入contrller-"+cid+"-"+gid);
		if(cid!=null&&cid>0) {
			System.out.println("查询利润：客户");
			return profitService.queryDetailBycid(cid);
		}else {
			System.out.println("查询利润：商品");
			return profitService.queryDetailBygid(gid);
		}
	}
}
