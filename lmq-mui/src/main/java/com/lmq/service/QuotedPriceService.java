package com.lmq.service;

import java.util.List;

import com.lmq.domain.zjf.QuotedPrice;

public interface QuotedPriceService {
	public List<QuotedPrice> queryBySidAll(Integer sid);
}	
