package com.lmq.service;

import java.util.List;

import com.lmq.domain.Classify;
import com.lmq.domain.Customer;

public interface CustomerService {
	/**
	 * 查询客户
	 * @param sid 门店id
	 * @return
	 */
	List<Classify> queryGroupByAcronymname(Integer sid);
	/**
	 * 添加客户
	 * @param record
	 * @return
	 */
	int insertSelective(Customer record);
	 /**
       * 根据客户ID查询
    * @param id
    * @return
    */
	Customer selectByPrimaryKey(Integer id);
	
	/**
	 * 修改客戶
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Customer record);
}
