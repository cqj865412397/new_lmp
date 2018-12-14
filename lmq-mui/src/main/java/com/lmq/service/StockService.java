package com.lmq.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Stock;

public interface StockService {
	 int insertSelective(Stock record);

	    List<Stock> queryList(String startTime,String endTime,String filtrate,Integer sid);
	    
	    int updateStatusById(Integer id,Integer status);
	    
	    String getTimeNum(Integer uid);
	    
	    Stock queryById(Integer id);
		//新增
		public Integer insert(Stock stock);
		//批量删除
		public Integer deleteByIds(List<Integer> stockIds);
}
