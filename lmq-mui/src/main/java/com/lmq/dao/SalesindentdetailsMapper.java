package com.lmq.dao;

import com.lmq.domain.Salesindentdetails;

public interface SalesindentdetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salesindentdetails record);

    int insertSelective(Salesindentdetails record);

    Salesindentdetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salesindentdetails record);

    int updateByPrimaryKey(Salesindentdetails record);
}