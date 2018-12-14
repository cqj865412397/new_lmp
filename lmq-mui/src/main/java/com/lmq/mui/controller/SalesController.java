package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.dao.StockMapper;
import com.lmq.dao.StockdetailMapper;
import com.lmq.domain.Sales;
import com.lmq.domain.Salesindent;
import com.lmq.domain.Stock;
import com.lmq.domain.Stockdetail;
import com.lmq.service.SalesService;
import com.lmq.service.imp.SalesServiceImpl;

@RestController
@RequestMapping("/s")
public class SalesController {
	
	@Autowired
	SalesService ss;
	
	@Autowired
	StockdetailMapper sdm;
	
	

	
	//新增销售单
	@RequestMapping(value="/addSales",produces="application/json;charset=utf-8")
	public Sales addSales(@RequestBody Sales s) {
		//ss.insertSelective(s);
		System.out.println(s.getUser1());
		ss.insertSelective(s);
		return s;
	}
	
	//通过用户id找到用户当日最新的订单
	@RequestMapping("/getTimeNum")
	public String getTimeNub(Integer uid) {
		String timeNub=ss.getTimeNum(uid);
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
	
	//查询出列表数据
		@RequestMapping("/queryList")
		public List<Sales> queryList(String startTime,String endTime,String filtrate,Integer sid) {
			System.out.println("显示参数"+startTime+","+endTime+","+filtrate+","+sid);
			return ss.queryList(startTime,endTime,filtrate,sid);
		}
		//通过id查询出订单详情
		@RequestMapping("/queryById")
		public Sales queryById(Integer id) {
			return ss.queryById(id);
		}
		
		//删除销售订单 实质是修改订单的状态
		@RequestMapping("/deleteById")
		public int updateStatusByIdToDelete(Integer id) {
			return ss.updateStatusById(id, 1);
		}
}
