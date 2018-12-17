package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.PaytypeMapper;
import com.lmq.domain.Paytype;
import com.lmq.service.PayTypeService;
@Service
@Transactional
public class PayTypeServiceImpl implements PayTypeService{
	@Autowired
	PaytypeMapper pm;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return pm.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Paytype record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Paytype record) {
		// TODO Auto-generated method stub
		return pm.insertSelective(record);
	}

	@Override
	public Paytype selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
		System.out.println(1);
		return pm.queryAll();
	}

	@Override
	public List<Paytype> queryByUserid(Paytype obj) {
		// TODO Auto-generated method stub
		return pm.queryByUserid(obj);
	}

}
