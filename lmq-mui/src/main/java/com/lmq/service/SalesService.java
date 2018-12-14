package com.lmq.service;

import java.util.List;

import com.lmq.domain.Sales;
import com.lmq.domain.Salesindent;

public interface SalesService {


    int insertSelective(Sales record);

    String getTimeNum(Integer uid);
    Sales queryById(Integer id);
    List<Sales> queryList(String startTime,String endTime,String filtrate,Integer sid);
    int updateStatusById(Integer id,Integer status);

}
