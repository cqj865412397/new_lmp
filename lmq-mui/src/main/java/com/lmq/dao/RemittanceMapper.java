package com.lmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Remittance;

public interface RemittanceMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Remittance record);

	int insertSelective(Remittance record);

	Remittance selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Remittance record);

	int updateByPrimaryKey(Remittance record);

	String getTimeNum(Integer uid);

	List<Remittance> queryList(@Param("startTime") String startTime, @Param("endTime") String endTime,
			@Param("filtrate") String filtrate);
	
    int updateStatusById(@Param("id")Integer id,@Param("status")Integer status);
    Remittance queryInfoById(Integer id);
}