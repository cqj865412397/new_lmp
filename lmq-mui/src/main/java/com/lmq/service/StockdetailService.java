package com.lmq.service;

import java.util.List;

import com.lmq.domain.Stockdetail;

public interface StockdetailService {
	//新增
	public Integer insert(Stockdetail stockdetail);
	//查询单品的库存
	public Integer queryTotalCountByGoodsInstanceId(Integer gInId);

	//查询单品(无规格商品)的初始化库存
	public Stockdetail queryInitPriceBygoodsInstanceId(Integer gInId);
	//查询主表id
	public Integer querySid(Integer gInId);
	//批量删除
	public Integer deleteByGoodsInstanceIds(List<Integer> goodsinstanceIds);
}
