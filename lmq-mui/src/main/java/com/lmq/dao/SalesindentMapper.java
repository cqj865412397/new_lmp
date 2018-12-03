package com.lmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Salesdetails;
import com.lmq.domain.Salesindent;

public interface SalesindentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salesindent record);

    int insertSelective(Salesindent record);

    Salesindent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salesindent record);

    int updateByPrimaryKey(Salesindent record);
    Salesindent queryById(Integer id);
    List<Salesindent> queryList(@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("filtrate")String filtrate);
    int updateStatusById(@Param("id")Integer id,@Param("status")Integer status);
    String getTimeNum(Integer uid);
    Salesindent queryBySalesIndentNub(String SalesIndentNub);
    
}