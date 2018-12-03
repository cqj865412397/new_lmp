package com.lmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
    
    List<Stock> queryList(@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("filtrate")String filtrate);
    
    int updateStatusById(@Param("id")Integer id,@Param("status")Integer status);
    
    String getTimeNum(Integer uid);
    
    Stock queryById(Integer id);
}