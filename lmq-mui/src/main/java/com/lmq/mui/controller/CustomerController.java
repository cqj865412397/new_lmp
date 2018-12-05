package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Classify;
import com.lmq.domain.Customer;
import com.lmq.service.CustomerService;

@RestController
@RequestMapping("Customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@RequestMapping("queryGroupByAcronymname")
	/**
	 * 查询客户
	 * @param sid
	 * @return
	 */
	public List<Classify> queryGroupByAcronymname(Integer sid){
		return customerService.queryGroupByAcronymname(sid);
	}
	/**
	 * 新增客户
	 * @param record
	 * @return
	 */
	@RequestMapping("addCustomer")
	public int addCustomer(Customer record) {
		return customerService.insertSelective(record);
	}
	/**
	 * 根据ID查询客户
	 */
	@RequestMapping("selectByPrimaryKey")
	public Customer selectByPrimaryKey(Integer id) {
		return customerService.selectByPrimaryKey(id);
	}
	
	/**
	 * 修改客戶
	 */
	@RequestMapping("updateCustomerById")
	public int updateCustomerById(Customer record) {
		return customerService.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 根据客户ID查询客户Pid(客户类型)
	 */
	@RequestMapping("queryByIdResultPid")
	public int queryByIdResultPid(Integer id) {
		return customerService.queryByIdResultPid(id);
	}
	
	@RequestMapping("/queryBalanceById")
	public Customer queryBalanceById(Integer id) {
		return customerService.selectByPrimaryKey(id);
	}
	

	
}
