package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.SalesdetailsMapper;
import com.lmq.dao.SalesindentMapper;
import com.lmq.domain.Salesdetails;
import com.lmq.domain.Salesindent;
import com.lmq.service.SalesindentService;

@Service
@Transactional
public class SalesindentServiceImpl implements SalesindentService{
	
	@Autowired
	SalesindentMapper sim;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Salesindent record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Salesindent record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Salesindent selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Salesindent record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Salesindent record) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public List<Salesindent> queryList(String startTime,String endTime,String filtrate) {
		// TODO Auto-generated method stub
		System.out.println(filtrate);
		List<Salesindent> list=null;
		if(filtrate.equals("null")) {
			System.out.println("你好我是杨菊花");
			filtrate="";
		}
		return sim.queryList(startTime, endTime, filtrate);
	}

	@Override
	public Salesindent queryById(Integer id) {
		// TODO Auto-generated method stub
		return sim.queryById(id);
	}

	@Override
	public int updateStatusById(Integer id, Integer status) {
		// TODO Auto-generated method stub
		return sim.updateStatusById(id, status);
	}


	

}
