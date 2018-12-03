package com.lmq.mui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.Supplier;
import com.lmq.domain.SupplierClassify;
import com.lmq.service.SupplierService;

@RestController
@RequestMapping("Supplier")
public class SupplierController {
	@Autowired
	SupplierService supplierService;
	@RequestMapping("queryByIdAllSupplier")
	public List<SupplierClassify> queryByIdAllSupplier(Integer sid){
		return supplierService.queryByIdAllSupplier(sid);
	}
	
	//新增供应商
	@RequestMapping("insertSupplier")
	public int insertSupplier(Supplier record) {
		System.out.println();
		return supplierService.insertSelective(record);
	}
	
	//根据供应商ID查询
	@RequestMapping("querySupplierById")
	public Supplier querySupplierById(Integer id) {
		return supplierService.selectByPrimaryKey(id);
	}
	
	//根据供应商ID修改供应商
	@RequestMapping("updateSupplierById")
	public int updateSupplierById(Supplier record) {
		return supplierService.updateByPrimaryKeySelective(record);
	}
}
