package com.lmq.mui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Goods;
import com.lmq.service.GoodsService;

@RestController
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	GoodsService gs;
	
	@RequestMapping("/query")
	public Goods query(){
		
		System.out.println("qiao");
		
		
		
		return gs.query();
	}
	
	@RequestMapping("/query1")
	public String query1(){
		
		
		
		
		
		return null;
	}
	
	
	
}
