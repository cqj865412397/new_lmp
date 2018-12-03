package com.lmq.dao;

import java.util.List;
import java.util.Map;

import com.lmq.domain.Salesdetails;

public interface SalesdetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salesdetails record);

    int insertSelective(Salesdetails record);

    Salesdetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salesdetails record);

    int updateByPrimaryKey(Salesdetails record);
    int adds(Map<String, Object> map);
    
    List<Salesdetails> queryBySalesid(Integer Salesid);
    
    int updateStatusBySalesid(Integer Salesid);
    
}