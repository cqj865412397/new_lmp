package com.lmq.dao;

import com.lmq.domain.Remittance;

public interface RemittanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Remittance record);

    int insertSelective(Remittance record);

    Remittance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Remittance record);

    int updateByPrimaryKey(Remittance record);
}