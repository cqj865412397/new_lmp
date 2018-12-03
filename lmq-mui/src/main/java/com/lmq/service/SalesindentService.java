package com.lmq.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Salesdetails;
import com.lmq.domain.Salesindent;

public interface SalesindentService {
    int insertSelective(Salesindent record);

    Salesindent queryById(Integer id);
    List<Salesindent> queryList(String startTime,String endTime,String filtrate);
    int updateStatusById(Integer id,Integer status);
    String getTimeNum(Integer uid);

}
