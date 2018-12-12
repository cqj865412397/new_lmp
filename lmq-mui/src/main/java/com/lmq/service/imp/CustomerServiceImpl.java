package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.CustomerMapper;
import com.lmq.dao.SalesMapper;
import com.lmq.domain.Classify;
import com.lmq.domain.Customer;
import com.lmq.service.CustomerService;
import com.lmq.utils.ChineseToEnglish;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerMapper mapper;
	@Autowired
	ChineseToEnglish chinese;
	@Autowired
	SalesMapper salesmapper;
	/**
	 * 按照门店查询客户
	 */
	@Override
	public List<Classify> queryGroupByAcronymname(Integer sid) {
		 List<Classify> map = mapper.queryGroupByAcronymname(sid);
		 return map;
	}
	/**
	 * 新增客户
	 */
	@Override
	public int insertSelective(Customer record) {
		// TODO Auto-generated method stub
		String name=record.getName();
		record.setEnglishname(chinese.getPingYin(name));
		record.setAcronymname(chinese.getPinYinHeadChar(name).substring(0, 1).toUpperCase());
		return mapper.insertSelective(record);
	}
	/**
	 * 根据ID查询客户
	 */
	@Override
	public Customer selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}
	/**
	 * 修改客戶
	 */
	@Override
	public int updateByPrimaryKeySelective(Customer record) {
		// TODO Auto-generated method stub
		String name=record.getName();
		record.setEnglishname(chinese.getPingYin(name));
		record.setAcronymname(chinese.getPinYinHeadChar(name).substring(0, 1).toUpperCase());
		return mapper.updateByPrimaryKeySelective(record);
	}
	/**
	 * 删除客戶
	 */
	@Override
	public int deleteByCid(Integer id) {
		// 未发生业务关系可以删除
		int count=salesmapper.queryCountByCid(id);
		if(count<1) {
			return mapper.deleteByCid(id);
		}
		return 0;
	}
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Customer record) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int updateByPrimaryKey(Customer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBalanceById(Customer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer queryBalanceById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.queryBalanceById(id);
	}
	/**
	 * 根据客户ID查询客户Pid(客户类型)
	 */
	@Override
	public int queryByIdResultPid(Integer id) {
		// TODO Auto-generated method stub
		return mapper.queryByIdResultPid(id);
	}


}
