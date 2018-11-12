package com.lmq.dao;

import com.lmq.domain.Storetype;

public interface StoretypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Storetype record);

    int insertSelective(Storetype record);

    Storetype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Storetype record);

    int updateByPrimaryKey(Storetype record);
}