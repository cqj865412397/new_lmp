package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.report.ArrearageMapper;
import com.lmq.domain.report.Arrearage;
import com.lmq.service.report.ArrearageService;
@Service
@Transactional
public class ArrearageServiceImpl implements ArrearageService {
	@Autowired
	ArrearageMapper mapper;
	@Override
	public List<Arrearage> queryReceipt(String starttime, String endtime) {
		// TODO Auto-generated method stub
		return mapper.queryReceipt(starttime, endtime);
	}

	@Override
	public List<Arrearage> queryReceiptDetail(Integer cid,String starttime,String endtime) {
		// TODO Auto-generated method stub
		return mapper.queryReceiptDetail(cid,starttime,endtime);
	}

	@Override
	public List<Arrearage> queryPay(String starttime,String endtime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Arrearage> queryPayDetail(Integer sid,String starttime,String endtime) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
