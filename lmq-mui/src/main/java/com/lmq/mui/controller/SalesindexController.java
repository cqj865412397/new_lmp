package com.lmq.mui.controller;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Salesindent;
import com.lmq.service.SalesindentService;
import com.lmq.service.imp.SalesindentServiceImpl;

@RestController
@RequestMapping("/si")
public class SalesindexController {
	@Autowired
	SalesindentService sis;
	
	//通过id查询出订单详情
	@RequestMapping("/queryById")
	public Salesindent queryById(Integer id) {
		Salesindent s=sis.queryById(id);
		return s;
	}
	
	//显示列表 传入了时间和搜索条件
	@RequestMapping("/queryList")
	public List<Salesindent> queryList(String startTime,String endTime,String filtrate) {
		System.out.println("显示参数"+startTime+","+endTime+","+filtrate);
		return sis.queryList(startTime,endTime,filtrate);
	}
	//删除销售订单 实质是修改订单的状态
	@RequestMapping("/deleteById")
	public int updateStatusByIdToDelete(Integer id) {
		return sis.updateStatusById(id, 1);
	}
	//新增
	@RequestMapping(value="/addAjax",produces="application/json;charset=utf-8")
	public void addAjax(@RequestBody Salesindent s) {
		System.out.println(sis.insertSelective(s));
	}
	
	//通过用户id找到用户当日最新的订单
	@RequestMapping("/getTimeNum")
	public String getTimeNub(Integer uid) {
		String timeNub=sis.getTimeNum(uid);
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
}
