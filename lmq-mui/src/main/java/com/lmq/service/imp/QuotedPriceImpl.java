package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.QuotedPriceMapper;
import com.lmq.domain.zjf.QuotedPrice;
import com.lmq.service.QuotedPriceService;

@Service
@Transactional
public class QuotedPriceImpl implements QuotedPriceService{
	@Autowired
	QuotedPriceMapper mapper;
	
	public List<QuotedPrice> queryBySidAll(Integer sid){
		return mapper.queryBySidAll(sid);
	}
}
