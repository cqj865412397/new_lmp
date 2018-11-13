package com.lmq.dao;

import com.lmq.domain.Salesindent;

public interface SalesindentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salesindent record);

    int insertSelective(Salesindent record);

    Salesindent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salesindent record);

    int updateByPrimaryKey(Salesindent record);
}