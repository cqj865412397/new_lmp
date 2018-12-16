package com.lmq.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Customerrecharge;
import com.lmq.domain.Remittance;

public interface RemittanceService {
    int insertSelective(Remittance record);

    
    String getTimeNum(Integer uid);
    
    List<Remittance> queryList(String startTime,String endTime,String filtrate,Integer sid);
    
    int updateStatusById(Integer id,Integer status);
    Remittance queryInfoById(Integer id);
}
