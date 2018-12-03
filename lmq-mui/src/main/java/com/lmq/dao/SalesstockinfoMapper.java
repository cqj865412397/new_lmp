package com.lmq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Salesstockinfo;

public interface SalesstockinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salesstockinfo record);

    int insertSelective(Salesstockinfo record);

    Salesstockinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salesstockinfo record);

    int updateByPrimaryKey(Salesstockinfo record);
    int adds(Map<String, Object> map);
    int updateStatusBySalesid(@Param("salesid")Integer salesid,@Param("status")Integer status);
    
    List<Salesstockinfo> queryBySalesid(Integer salesid);
}