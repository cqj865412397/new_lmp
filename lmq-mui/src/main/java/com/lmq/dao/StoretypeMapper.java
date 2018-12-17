package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Storetype;

public interface StoretypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Storetype record);

    int insertSelective(Storetype record);

    Storetype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Storetype record);

    int updateByPrimaryKey(Storetype record);

    List<Storetype> Storetype(Integer User1);
    
    List<Storetype> queryBylevel(Storetype obj);
}