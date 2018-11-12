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
		
		System.out.println("1");
		
		
		
		return gs.query();
	}
	
	@RequestMapping("/zxc")
	public Goods query1(){
		System.out.println("1");
		return gs.query();
	}
	
}
