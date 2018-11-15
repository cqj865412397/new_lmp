package com.lmq.dao;

import com.lmq.domain.Goodsinstance;

public interface GoodsinstanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodsinstance record);

    int insertSelective(Goodsinstance record);

    Goodsinstance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsinstance record);

    int updateByPrimaryKey(Goodsinstance record);
}