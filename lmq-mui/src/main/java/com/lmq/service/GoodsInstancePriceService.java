package com.lmq.service;

import java.util.List;

import com.lmq.domain.Goodsinstanceprice;

public interface GoodsInstancePriceService {
	public Integer insertPrices(List<Goodsinstanceprice> priceList);
	
	public Integer insert(Goodsinstanceprice record);
	//查询单品价格集合
	public List<Goodsinstanceprice> queryPriceListByGid(Integer gInId);
	//批量删除
	public Integer deleteByIds(List<Integer> goodsInstanceIds);
}
