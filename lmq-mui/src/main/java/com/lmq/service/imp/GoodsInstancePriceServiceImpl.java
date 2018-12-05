package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.GoodsinstancepriceMapper;
import com.lmq.domain.Goodsinstanceprice;
import com.lmq.service.GoodsInstancePriceService;
@Service
public class GoodsInstancePriceServiceImpl implements GoodsInstancePriceService{

	@Autowired
	GoodsinstancepriceMapper goodsinstancepriceMapper;
	
	
	public Integer insertPrices(List<Goodsinstanceprice> priceList) {
		return goodsinstancepriceMapper.insertPrices(priceList);
	}


	public Integer insert(Goodsinstanceprice record) {
		return goodsinstancepriceMapper.insert(record);
	}


	public List<Goodsinstanceprice> queryPriceListByGid(Integer gInId) {
		return goodsinstancepriceMapper.queryPriceListByGid(gInId);
	}


	public Integer deleteByIds(List<Integer> goodsInstanceIds) {
		return goodsinstancepriceMapper.deleteByIds(goodsInstanceIds);
	}

}
