package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Stock;

public interface StockMapper {
	//批量删除
	public Integer deleteByIds(List<Integer> stockIds);
	
	/***
	 * 自动生成
	 */
	
    int deleteByPrimaryKey(Integer id);
    //新增
    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}