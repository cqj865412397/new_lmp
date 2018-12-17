package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Paytype;
import com.lmq.service.imp.PayTypeServiceImpl;

@RestController
@RequestMapping("/paytype")
public class PayTypeController {
	@Autowired
	PayTypeServiceImpl ps;
	
	@RequestMapping("/queryAll")
	public List<Paytype> queryAll() {
		return ps.queryAll();
	}
	
	@RequestMapping("/queryByUserid")
	public List<Paytype> queryByUserid(Paytype obj) {
		return ps.queryByUserid(obj);
	}
	@RequestMapping("/insertPaytype")
	public int insertPaytype(Paytype obj) {
		return ps.insertSelective(obj);
	}
	
	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		return ps.deleteByPrimaryKey(id);
	}
}
