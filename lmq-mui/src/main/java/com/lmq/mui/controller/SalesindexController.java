package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Salesindent;
import com.lmq.service.imp.SalesindentServiceImpl;

@RestController
@RequestMapping("/si")
public class SalesindexController {
	@Autowired
	SalesindentServiceImpl sis;
	
	@RequestMapping("/queryById")
	public Salesindent queryById(Integer id) {
		return sis.queryById(id);
	}
	
	@RequestMapping("/queryList")
	public List<Salesindent> queryList(String startTime,String endTime,String filtrate) {
		System.out.println("显示参数"+startTime+","+endTime+","+filtrate);
		return sis.queryList(startTime,endTime,filtrate);
	}
	@RequestMapping("/deleteById")
	public int updateStatusByIdToDelete(Integer id) {
		return sis.updateStatusById(id, 2);
	}
}
