package com.lmq.dao;

import java.util.Map;

import com.lmq.domain.Salesindentdetails;

public interface SalesindentdetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salesindentdetails record);

    int insertSelective(Salesindentdetails record);

    Salesindentdetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salesindentdetails record);

    int updateByPrimaryKey(Salesindentdetails record);
    int adds(Map<String, Object> map);
}