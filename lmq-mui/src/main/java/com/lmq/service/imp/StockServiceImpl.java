package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.StockMapper;
import com.lmq.domain.Stock;
import com.lmq.service.StockService;
@Service
public class StockServiceImpl implements StockService{

	@Autowired
	StockMapper stockMapper;

	public Integer insert(Stock stock) {
		return stockMapper.insert(stock);
	}

	public Integer deleteByIds(List<Integer> stockIds) {
		return stockMapper.deleteByIds(stockIds);
	}

	
	
	
}
