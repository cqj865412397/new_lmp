package com.lmq.dao;

import com.lmq.domain.Bit;

public interface BitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bit record);

    int insertSelective(Bit record);

    Bit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bit record);

    int updateByPrimaryKey(Bit record);
}