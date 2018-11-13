package com.lmq.dao;

import com.lmq.domain.Storeuser;

public interface StoreuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Storeuser record);

    int insertSelective(Storeuser record);

    Storeuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Storeuser record);

    int updateByPrimaryKey(Storeuser record);
}