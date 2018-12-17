package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Storetype;
import com.lmq.domain.User;
import com.lmq.service.Storetypeservice;

@RestController
@RequestMapping("Storetype")
public class StoretypeController {

	@Autowired
	Storetypeservice s;
	@RequestMapping("queryBylevel")
	public List<Storetype> queryBylevel(Storetype obj){
		System.out.println();
		return s.queryBylevel(obj);
	}
}
