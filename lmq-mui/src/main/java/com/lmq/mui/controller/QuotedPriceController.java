package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Quote;
import com.lmq.domain.QuotedPriceClass;
import com.lmq.service.CustomerService;
import com.lmq.service.QuotedPriceService;

@RestController
@RequestMapping("QuotedPrice")
public class QuotedPriceController {
	
	
	@Autowired
	QuotedPriceService service;
	@RequestMapping("queryBySidAll")
	public List<QuotedPriceClass> queryBySidAll(Integer sid){
		return service.queryBySidAll(1);
	}
	@RequestMapping("addQuoteprice")
	public int addQuoteprice(Quote obj){
		System.out.println(123);
		return service.addQuoteprice(obj);
	}
	@RequestMapping("updateByIdQuoteprice")
	public int updateByIdQuoteprice(Quote obj){
		return service.updateByIdQuoteprice(obj);
	}
	
}
