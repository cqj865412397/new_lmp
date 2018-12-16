package com.lmq.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.CustomerMapper;
import com.lmq.dao.SalesdetailsMapper;
import com.lmq.dao.SalesindentMapper;
import com.lmq.dao.SalesindentdetailsMapper;
import com.lmq.domain.Customer;
import com.lmq.domain.Salesdetails;
import com.lmq.domain.Salesindent;
import com.lmq.domain.Salesindentdetails;
import com.lmq.service.SalesindentService;

@Service
@Transactional
public class SalesindentServiceImpl implements SalesindentService{
	
	@Autowired
	SalesindentMapper sim;
	@Autowired
	SalesindentdetailsMapper sidm;
	@Autowired
	CustomerMapper cm;

	@Override
	public int insertSelective(Salesindent record) {
		// TODO Auto-generated method stub
		sim.insertSelective(record);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("salesindentid",record.getId());
		List<Salesindentdetails> list=record.getSalesindentdetails();
		map.put("slist", list);
		System.out.println("本次操作的用户id:"+record.getCid());
		System.out.println("本次定金为:"+record.getDeposi());
		if(record.getDeposi()!=null) {
			Customer c=new Customer();
			c.setId(Integer.parseInt(record.getCid()));
			c.setBalance(record.getDeposi());
			cm.updateBalanceById(c);
		}
		return sidm.adds(map);
	}



	@Override
	public List<Salesindent> queryList(String startTime,String endTime,String filtrate,Integer sid) {
		// TODO Auto-generated method stub
		System.out.println(filtrate);
		List<Salesindent> list=null;
		if(filtrate.equals("null")) {
			System.out.println("你好我是杨菊花");
			filtrate="";
		}
		return sim.queryList(startTime, endTime, filtrate,sid);
	}

	@Override
	public Salesindent queryById(Integer id) {
		// TODO Auto-generated method stub
		return sim.queryById(id);
	}

	@Override
	public int updateStatusById(Integer id, Integer status) {
		// TODO Auto-generated method stub
		
		
		Salesindent si = sim.queryById(id);
		//判断是否存在定金，如果有定金就返退
		if(si.getDeposi()!=null) {
			Customer c=new Customer();
			c.setId(Integer.parseInt(si.getCid()));
			c.setBalance(-si.getDeposi());
			cm.updateBalanceById(c);
		}
		return sim.updateStatusById(id, status);
	}

	@Override
	public String getTimeNum(Integer uid) {
		// TODO Auto-generated method stub
		return sim.getTimeNum(uid);
	}


}
