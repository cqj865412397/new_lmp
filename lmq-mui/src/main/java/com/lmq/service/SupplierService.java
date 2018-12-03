package com.lmq.service;

import java.util.List;

import com.lmq.domain.Supplier;
import com.lmq.domain.SupplierClassify;

public interface SupplierService {
	 List<SupplierClassify> queryByIdAllSupplier(Integer sid);
	 
	 //新增供应商
	int insertSelective(Supplier record);
	
	//根据供应商ID查询
	Supplier selectByPrimaryKey(Integer id);
	
	//根据供应商ID修改供应商
	int updateByPrimaryKeySelective(Supplier record);
}
