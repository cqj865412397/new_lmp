package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Pricetype;

public interface PricetypeMapper {
	//查询价格类型
	public List<Pricetype> queryPriceTypeBySid(Integer sId);
	
	
	
	
	
	/**
	 * 自动生成
	 */
    int deleteByPrimaryKey(Integer id);

    int insert(Pricetype record);

    int insertSelective(Pricetype record);

    Pricetype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pricetype record);

    int updateByPrimaryKey(Pricetype record);
}