package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Salesdetails;

public interface SalesdetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salesdetails record);

    int insertSelective(Salesdetails record);

    Salesdetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salesdetails record);

    int updateByPrimaryKey(Salesdetails record);
    
}