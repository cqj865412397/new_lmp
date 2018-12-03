package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Sales;
import com.lmq.domain.Salesindent;
import com.lmq.domain.Stock;
import com.lmq.service.StockService;
import com.lmq.service.imp.StockServiceImpl;

@RestController
@RequestMapping("/stock")
public class StockController {
	@Autowired
	StockService ssi;
	
	//显示列表 传入了时间和搜索条件
		@RequestMapping("/queryList")
		public List<Stock> queryList(String startTime,String endTime,String filtrate) {
			System.out.println("显示参数"+startTime+","+endTime+","+filtrate);
			return ssi.queryList(startTime,endTime,filtrate);
		}
		
		//通过用户id找到用户当日最新的订单
		@RequestMapping("/getTimeNum")
		public String getTimeNub(Integer uid) {
			String timeNub=ssi.getTimeNum(uid);
			//判断找没找到当日的订单消息 
			if(timeNub!=null) {
				//有就再原有的基础上+1
				timeNub=(Long.parseLong(timeNub)+1)+"";
				return timeNub;
			}else {
				//没有就返回404 前端处理数据
				//Calendar cal=Calendar.getInstance();   
				return "404";
			}
		}
		
		//新增销售单
		@RequestMapping(value="/addSales",produces="application/json;charset=utf-8")
		public Stock addSales(@RequestBody Stock s) {
			//ss.insertSelective(s);
			ssi.insertSelective(s);
			return s;
		}
	
}
