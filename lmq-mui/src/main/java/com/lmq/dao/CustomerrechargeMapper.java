package com.lmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Customerrecharge;

public interface CustomerrechargeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customerrecharge record);

    int insertSelective(Customerrecharge record);

    Customerrecharge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customerrecharge record);

    int updateByPrimaryKey(Customerrecharge record);
    
    String getTimeNum(Integer uid);
    
    List<Customerrecharge> queryList(@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("filtrate")String filtrate);
    
    int updateStatusById(@Param("id")Integer id,@Param("status")Integer status);
    
    Customerrecharge queryInfoById(Integer id);

}