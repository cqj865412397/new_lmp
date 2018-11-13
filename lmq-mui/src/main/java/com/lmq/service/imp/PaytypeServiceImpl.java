package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.GoodsMapper;
import com.lmq.dao.PaytypeMapper;
import com.lmq.domain.Paytype;
import com.lmq.service.PaytypeService;

@Service
@Transactional
public class PaytypeServiceImpl implements PaytypeService{
	
	@Autowired
	PaytypeMapper paytypeMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Paytype record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Paytype record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Paytype selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return paytypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Paytype record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Paytype record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Paytype> queryAll() {
		// TODO Auto-generated method stub
		return paytypeMapper.queryAll();
	}

}
