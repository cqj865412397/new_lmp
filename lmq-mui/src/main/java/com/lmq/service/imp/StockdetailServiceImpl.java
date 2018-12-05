package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.StockdetailMapper;
import com.lmq.domain.Stockdetail;
import com.lmq.service.StockdetailService;
@Service
public class StockdetailServiceImpl implements StockdetailService{

	@Autowired
	StockdetailMapper stockdetailMapper;

	public Integer insert(Stockdetail stockdetail) {
		return stockdetailMapper.insert(stockdetail);
	}

	public Integer queryTotalCountByGoodsInstanceId(Integer gInId) {
		return stockdetailMapper.queryTotalCountByGoodsInstanceId(gInId);
	}

	public Stockdetail queryInitPriceBygoodsInstanceId(Integer gInId) {
		return stockdetailMapper.queryInitPriceBygoodsInstanceId(gInId);
	}

	public Integer querySid(Integer gInId) {
		return stockdetailMapper.querySid(gInId);
	}

	public Integer deleteByGoodsInstanceIds(List<Integer> goodsinstanceIds) {
		return stockdetailMapper.deleteByGoodsInstanceIds(goodsinstanceIds);
	}

	
	
	
	

}
