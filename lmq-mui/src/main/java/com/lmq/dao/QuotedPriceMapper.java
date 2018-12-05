package com.lmq.dao;

import java.util.List;

import com.lmq.domain.QuotedPriceClass;

public interface QuotedPriceMapper {
	//根据门店查询客户报价
	public List<QuotedPriceClass> queryBySidAll(Integer sid);

}
