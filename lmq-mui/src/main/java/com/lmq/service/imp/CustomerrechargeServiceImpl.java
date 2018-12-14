package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.CustomerMapper;
import com.lmq.dao.CustomerrechargeMapper;
import com.lmq.domain.Customer;
import com.lmq.domain.Customerrecharge;
import com.lmq.domain.Salesindent;
import com.lmq.service.CustomerrechargeService;

@Service
@Transactional
public class CustomerrechargeServiceImpl implements CustomerrechargeService{
	@Autowired
	CustomerrechargeMapper ccm;
	@Autowired
	CustomerMapper cm;


	@Override
	public int insertSelective(Customerrecharge record) {
		// TODO Auto-generated method stub
		ccm.insertSelective(record);
		double money=record.getMoney();
		int cid=record.getCid();
		Customer c=new Customer();
		c.setId(cid);
		c.setBalance(money);
		cm.updateBalanceById(c);
		return 0;
	}


	@Override
	public String getTimeNum(Integer uid) {
		// TODO Auto-generated method stub
		return ccm.getTimeNum(uid);
	}

	@Override
	public List<Customerrecharge> queryList(String startTime, String endTime, String filtrate,Integer sid) {
		// TODO Auto-generated method stub
		
		System.out.println(filtrate);
		List<Salesindent> list = null;
		if (filtrate.equals("null")) {
			System.out.println("你好我是杨菊花");
			filtrate = "";
		}
		return ccm.queryList(startTime, endTime, filtrate,sid);
		
	}

	@Override
	public int updateStatusById(Integer id, Integer status) {
		// TODO Auto-generated method stub
		ccm.updateStatusById(id, status);
		Customerrecharge cc=ccm.selectByPrimaryKey(id);
		double balance = cc.getMoney();
		Customer c = new Customer();
		c.setId(cc.getCid());
		c.setBalance(-balance);
		cm.updateBalanceById(c);
		return 0;
	}


	@Override
	public Customerrecharge queryInfoById(Integer id) {
		// TODO Auto-generated method stub
		return ccm.queryInfoById(id);
	}
	
	
}
