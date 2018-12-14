package com.lmq.service.imp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lmq.dao.RemittanceMapper;
import com.lmq.dao.SupplierMapper;
import com.lmq.domain.Customer;
import com.lmq.domain.Customerrecharge;
import com.lmq.domain.Remittance;
import com.lmq.domain.Salesindent;
import com.lmq.domain.Supplier;
import com.lmq.service.RemittanceService;

@Service
@Transactional
public class RemittanceServiceImpl implements RemittanceService{
	@Autowired
	RemittanceMapper rm;
	@Autowired
	SupplierMapper sm;
		

	@Override
	public int insertSelective(Remittance record) {
		// TODO Auto-generated method stub
		rm.insertSelective(record);
		double money=record.getMoney();
		int cid=Integer.parseInt(record.getSid());
		Supplier s=new Supplier();
		s.setId(cid);
		s.setBalance(money);
		sm.updateBalanceById(s);
		return 0;
	}

	@Override
	public String getTimeNum(Integer uid) {
		// TODO Auto-generated method stub
		return rm.getTimeNum(uid);
	}

	@Override
	public List<Remittance> queryList(String startTime, String endTime, String filtrate,Integer sid) {
		// TODO Auto-generated method stub
		System.out.println(filtrate);
		List<Salesindent> list = null;
		if (filtrate.equals("null")) {
			System.out.println("你好我是杨菊花");
			filtrate = "";
		}
		return rm.queryList(startTime, endTime, filtrate,sid);
	}

	@Override
	public int updateStatusById(Integer id, Integer status) {
		// TODO Auto-generated method stub
		rm.updateStatusById(id, status);
		Remittance cc=rm.selectByPrimaryKey(id);
		double balance = cc.getMoney();
		Supplier c = new Supplier();
		c.setId(Integer.parseInt(cc.getSid()));
		c.setBalance(-balance);
		sm.updateBalanceById(c);
		return 0;
	}

	@Override
	public Remittance queryInfoById(Integer id) {
		// TODO Auto-generated method stub
		return rm.queryInfoById(id);
	}

	
}
