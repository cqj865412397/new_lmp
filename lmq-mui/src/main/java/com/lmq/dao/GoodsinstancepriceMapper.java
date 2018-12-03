package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Goodsinstanceprice;

public interface GoodsinstancepriceMapper {
	//查询单品价格集合
	public List<Goodsinstanceprice> queryPriceListByGid(Integer gInId);
	//批量新增
	public Integer insertPrices(List<Goodsinstanceprice> priceList);
	//批量删除
	public Integer deleteByIds(List<Integer> goodsInstanceIds);
	
	
	
	/**
	 * 自动生成
	 */
    int deleteByPrimaryKey(Integer id);

    int insert(Goodsinstanceprice record);

    int insertSelective(Goodsinstanceprice record);

    Goodsinstanceprice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsinstanceprice record);

    int updateByPrimaryKey(Goodsinstanceprice record);
}