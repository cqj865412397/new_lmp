package com.lmq.dao;

import com.lmq.domain.Stocksstoreinfo;

public interface StocksstoreinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stocksstoreinfo record);

    int insertSelective(Stocksstoreinfo record);

    Stocksstoreinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stocksstoreinfo record);

    int updateByPrimaryKey(Stocksstoreinfo record);
}