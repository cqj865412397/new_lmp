package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Bit;

public interface BitMapper {
	
	// 用于查询单位
	public List<Bit> queryBitBySid(Integer Sid);
	
	
	
	/**
	 * 自动生成的方法
	 */
    int deleteByPrimaryKey(Integer id);

    int insert(Bit record);

    int insertSelective(Bit record);

    Bit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bit record);

    int updateByPrimaryKey(Bit record);
}