package com.lmq.dao;

import com.lmq.domain.Paytype;

public interface PaytypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Paytype record);

    int insertSelective(Paytype record);

    Paytype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Paytype record);

    int updateByPrimaryKey(Paytype record);
}