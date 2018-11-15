package com.lmq.dao;

import com.lmq.domain.Pricetype;

public interface PricetypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pricetype record);

    int insertSelective(Pricetype record);

    Pricetype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pricetype record);

    int updateByPrimaryKey(Pricetype record);
}