package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Paytype;
import com.lmq.service.imp.PaytypeServiceImpl;

@RestController
@RequestMapping("/paytype")
public class PaytypeController {
	@Autowired
	PaytypeServiceImpl ps;
	
	@RequestMapping("/queryAll")
	public List<Paytype> queryAll() {
		return ps.queryAll();
	}
	
	@RequestMapping("/queryById")
	public Paytype queryById() {
		return ps.selectByPrimaryKey(1);
	}
}
