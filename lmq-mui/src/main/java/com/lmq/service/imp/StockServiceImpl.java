package com.lmq.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.StockMapper;
import com.lmq.dao.StockdetailMapper;
import com.lmq.dao.SupplierMapper;
import com.lmq.domain.Customer;
import com.lmq.domain.Salesdetails;
import com.lmq.domain.Salesindent;
import com.lmq.domain.Stock;
import com.lmq.domain.Stockdetail;
import com.lmq.domain.Supplier;
import com.lmq.service.StockService;

@Service
@Transactional
public class StockServiceImpl implements StockService {
	@Autowired
	StockMapper stockmapper;
	@Autowired
	StockdetailMapper stockdetailmapper;
	@Autowired
	SupplierMapper suppliermapper;

	@Override
	public int insertSelective(Stock record) {
		// TODO Auto-generated method stub
		
		stockmapper.insertSelective(record);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sid", record.getId());
		map.put("uid", record.getUid());
		List<Stockdetail> slist = record.getStockdetails();
		map.put("slist", slist);
		// 增加销售详情数据
		stockdetailmapper.adds(map);
		
		double balance = Double.parseDouble(record.getUser2()) - Double.parseDouble(record.getUser3());
		if (balance != 0) {
			Supplier sup = new Supplier();
			sup.setId(record.getSupid());
			sup.setBalance(-balance);
			System.out.println("这是实际支付金额" + sup.getBalance());
			suppliermapper.updateBalanceById(sup);
		}
		
		return 0;
	}

	
	@Override
	public List<Stock> queryList(String startTime, String endTime, String filtrate,Integer sid) {
		System.out.println(filtrate);
		List<Stock> list=null;
		if(filtrate.equals("null")) {
			System.out.println("你好我是杨菊花");
			filtrate="";
		}
		return stockmapper.queryList(startTime, endTime, filtrate,sid);
	}

	@Override
	public int updateStatusById(Integer id, Integer status) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTimeNum(Integer uid) {
		// TODO Auto-generated method stub
		return stockmapper.getTimeNum(uid);
	}

	@Override
	public Stock queryById(Integer id) {
		// TODO Auto-generated method stub
		return stockmapper.queryById(id);
	}
	
	public Integer insert(Stock stock) {
		return stockmapper.insert(stock);
	}

	public Integer deleteByIds(List<Integer> stockIds) {
		return stockmapper.deleteByIds(stockIds);
	}


	@Override
	public int updateByPrimaryKeySelective(Stock stock) {
		return stockmapper.updateByPrimaryKeySelective(stock);
	}
}

	
