package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Store;
import com.lmq.service.StoreService;

@RestController
@RequestMapping("Store")
public class StoreController {
	@Autowired
	StoreService s;
	@RequestMapping("queryByUserId")
	public List<Store> queryByUserId(Integer id){
		return s.queryByUserId(id);
	}
	
	@RequestMapping("CurrentStore")
	public List<Store> CurrentStore(Integer id){
		return s.CurrentStore(id);
	}
	
	@RequestMapping("insertSelective")
	public int insertSelective(@RequestBody Store obj){
		return s.insertSelective(obj);
	}
}
