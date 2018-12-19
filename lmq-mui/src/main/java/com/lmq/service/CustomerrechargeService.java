package com.lmq.service;

import java.util.List;

import com.lmq.domain.Customerrecharge;

public interface CustomerrechargeService {
    int insertSelective(Customerrecharge record);
    
    String getTimeNum(Integer uid);
    
    List<Customerrecharge> queryList(String startTime,String endTime,String filtrate,Integer sid);
    
    int updateStatusById(Integer id,Integer status);
    
   Customerrecharge queryInfoById(Integer id);

}
