package com.lmq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.GoodsMapper;
import com.lmq.domain.Goods;

@Service
@Transactional
public class GoodsService {
	
	@Autowired
	GoodsMapper goodsMapper;

	public Goods query(){
		return goodsMapper.selectByPrimaryKey(1);
	}
	
}
