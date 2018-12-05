package com.lmq.service;

import java.util.List;

import com.lmq.domain.QuotedPriceClass;
import com.lmq.domain.zjf.QuotedPrice;

public interface QuotedPriceService {
	public List<QuotedPriceClass> queryBySidAll(Integer sid);
}	
