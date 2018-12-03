package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Customerrecharge;
import com.lmq.domain.Remittance;
import com.lmq.service.RemittanceService;

@RestController
@RequestMapping("/Remittance")
public class RemittanceController {
	@Autowired
	RemittanceService rs;
	
	//通过用户id找到用户当日最新的订单
		@RequestMapping("/getTimeNum")
		public String getTimeNub(Integer uid) {
			String timeNub=rs.getTimeNum(uid);
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
		public int addRemittance(@RequestBody Remittance record) {
			return rs.insertSelective(record);
		}
		
		@RequestMapping("/queryList")
		public List<Remittance> queryList(String startTime,String endTime,String filtrate) {
			System.out.println("显示参数"+startTime+","+endTime+","+filtrate);
			return rs.queryList(startTime,endTime,filtrate);
		}
		
		//删除 实质是修改的状态
				@RequestMapping("/deleteById")
				public int updateStatusByIdToDelete(Integer id) {
					return rs.updateStatusById(id, 1);
				}
				
				@RequestMapping("/queryById")
				//通过id查询出单据信息
				public Remittance queryById(Integer id) {
					return rs.queryInfoById(id);
				}
}
