package com.lmq.service;

import java.util.List;

import com.lmq.domain.Stock;

public interface StockService {
	//新增
	public Integer insert(Stock stock);
	//批量删除
	public Integer deleteByIds(List<Integer> stockIds);
}
