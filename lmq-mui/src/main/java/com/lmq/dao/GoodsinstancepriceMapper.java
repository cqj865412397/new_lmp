package com.lmq.dao;

import com.lmq.domain.Goodsinstanceprice;

public interface GoodsinstancepriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodsinstanceprice record);

    int insertSelective(Goodsinstanceprice record);

    Goodsinstanceprice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsinstanceprice record);

    int updateByPrimaryKey(Goodsinstanceprice record);
}