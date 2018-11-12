package com.lmq.dao;

import com.lmq.domain.Standardinstance;

public interface StandardinstanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Standardinstance record);

    int insertSelective(Standardinstance record);

    Standardinstance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Standardinstance record);

    int updateByPrimaryKey(Standardinstance record);
}