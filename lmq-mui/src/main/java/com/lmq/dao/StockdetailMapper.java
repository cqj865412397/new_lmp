package com.lmq.dao;

import com.lmq.domain.Stockdetail;

public interface StockdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stockdetail record);

    int insertSelective(Stockdetail record);

    Stockdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stockdetail record);

    int updateByPrimaryKey(Stockdetail record);
}