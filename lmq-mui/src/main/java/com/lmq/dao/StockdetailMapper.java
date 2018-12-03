package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Stockdetail;

public interface StockdetailMapper {
	
	//查询单品库存
	public Integer queryTotalCountByGoodsInstanceId(Integer gInId);
	//查询单品(无规格商品)的初始化库存
	public Stockdetail queryInitPriceBygoodsInstanceId(Integer gInId);
	//查询进货价
	public Double queryInitPrice(Integer gInId);
	
	//查询主表id
	public Integer querySid(Integer gInId);
	
	//批量删除
	public Integer deleteByGoodsInstanceIds(List<Integer> goodsinstanceIds);
	/**
	 * 自定义
	 */
	
    int deleteByPrimaryKey(Integer id);

    int insert(Stockdetail record);

    int insertSelective(Stockdetail record);

    Stockdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stockdetail record);

    int updateByPrimaryKey(Stockdetail record);
}