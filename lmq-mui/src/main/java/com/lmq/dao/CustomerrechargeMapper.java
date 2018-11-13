package com.lmq.dao;

import com.lmq.domain.Customerrecharge;

public interface CustomerrechargeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customerrecharge record);

    int insertSelective(Customerrecharge record);

    Customerrecharge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customerrecharge record);

    int updateByPrimaryKey(Customerrecharge record);
}