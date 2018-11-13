package com.lmq.dao;

import com.lmq.domain.Salesstockinfo;

public interface SalesstockinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salesstockinfo record);

    int insertSelective(Salesstockinfo record);

    Salesstockinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salesstockinfo record);

    int updateByPrimaryKey(Salesstockinfo record);
}