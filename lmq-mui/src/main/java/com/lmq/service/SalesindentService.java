package com.lmq.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Salesdetails;
import com.lmq.domain.Salesindent;

public interface SalesindentService {
    int deleteByPrimaryKey(Integer id);

    int insert(Salesindent record);

    int insertSelective(Salesindent record);

    Salesindent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salesindent record);

    int updateByPrimaryKey(Salesindent record);
    Salesindent queryById(Integer id);
    List<Salesindent> queryList(String startTime,String endTime,String filtrate);
    int updateStatusById(Integer id,Integer status);

}
