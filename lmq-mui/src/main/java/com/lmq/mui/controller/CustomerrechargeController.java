package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Customerrecharge;
import com.lmq.service.CustomerrechargeService;

@RestController
@RequestMapping("/Customerrecharge")
public class CustomerrechargeController {
	@Autowired
	CustomerrechargeService ccs;
	
	//通过用户id找到用户当日最新的订单
		@RequestMapping("/getTimeNum")
		public String getTimeNub(Integer uid) {
			String timeNub=ccs.getTimeNum(uid);
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
		
		@RequestMapping(value="/add",produces="application/json;charset=utf-8")
		public int addCustomerrecharge(@RequestBody Customerrecharge record) {
			return ccs.insertSelective(record);
		}
		
		@RequestMapping("/queryList")
		public List<Customerrecharge> queryList(String startTime,String endTime,String filtrate,Integer sid) {
			System.out.println("显示参数"+startTime+","+endTime+","+filtrate+","+sid);
			return ccs.queryList(startTime,endTime,filtrate,sid);
		}
		
		//删除 实质是修改的状态
		@RequestMapping("/deleteById")
		public int updateStatusByIdToDelete(Integer id) {
			return ccs.updateStatusById(id, 1);
		}
		
		@RequestMapping("/queryById")
		//通过id查询出单据信息
		public Customerrecharge queryById(Integer id) {
			return ccs.queryInfoById(id);
		}
}
