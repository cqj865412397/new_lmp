package com.lmq.service;

import java.util.List;

import com.lmq.domain.Pricetype;

public interface PriceTypeService {

	public List<Pricetype> queryPriceTypeBySid(Integer sId);
}
