package com.lmq.dao;

import java.util.List;

import com.lmq.domain.zjf.QuotedPrice;

public interface QuotedPriceMapper {
	//根据门店查询客户报价
	public List<QuotedPrice> queryBySidAll(Integer sid);

}
