package com.lmq.service;

import java.util.List;


import com.lmq.domain.Stock;

public interface StockService {
	 int insertSelective(Stock record);

	    List<Stock> queryList(String startTime,String endTime,String filtrate);
	    
	    int updateStatusById(Integer id,Integer status);
	    
	    String getTimeNum(Integer uid);
	    
	    Stock queryById(Integer id);
	//新增
	public Integer insert(Stock stock);
	//批量删除
	public Integer deleteByIds(List<Integer> stockIds);
}
