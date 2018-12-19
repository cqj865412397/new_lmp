package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Store;

public interface StoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Store record);

    int insertSelective(Store obj);

    Store selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
    
    List<Store> queryByUserId(Integer id);
    
    List<Store> CurrentStore(Integer id);
    
}