package com.lmq.service;

import java.util.List;

import com.lmq.domain.QuotedPriceClass;

public interface QuotedPriceService {
	public List<QuotedPriceClass> queryBySidAll(Integer sid);
}	
