package com.lmq.service;

import java.util.List;

import com.lmq.domain.Quote;
import com.lmq.domain.QuotedPriceClass;

public interface QuotedPriceService {
	public List<QuotedPriceClass> queryBySidAll(Integer sid);

	// 添加报价
	public int addQuoteprice(Quote obj);

	// 添加报价
	public int updateByIdQuoteprice(Quote obj);
}
