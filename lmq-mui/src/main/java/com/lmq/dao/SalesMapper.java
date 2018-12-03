package com.lmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Sales;

public interface SalesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sales record);

    int insertSelective(Sales record);

    Sales selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sales record);

    int updateByPrimaryKey(Sales record);
    
    String getTimeNum(Integer uid);
    
    Sales queryById(Integer id);

    List<Sales> queryList(@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("filtrate")String filtrate);
    
    int updateStatusById(@Param("id")Integer id,@Param("status")Integer status);

}