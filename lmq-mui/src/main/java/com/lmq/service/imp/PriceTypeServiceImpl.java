package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.PricetypeMapper;
import com.lmq.domain.Pricetype;
import com.lmq.service.PriceTypeService;
@Service
public class PriceTypeServiceImpl implements PriceTypeService{

	@Autowired
	PricetypeMapper pricetypeMapper;
	
	public List<Pricetype> queryPriceTypeBySid(Integer sId) {
		return pricetypeMapper.queryPriceTypeBySid(sId);
	}
	
}
