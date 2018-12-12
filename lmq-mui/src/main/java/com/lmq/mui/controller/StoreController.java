package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
