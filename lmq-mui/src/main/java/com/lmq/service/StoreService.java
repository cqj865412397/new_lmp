package com.lmq.service;

import java.util.List;

import com.lmq.domain.Store;

public interface StoreService {
	 List<Store> queryByUserId(Integer id);
	 
	 List<Store> CurrentStore(Integer id);
	 
	 int insertSelective(Store obj);
	 
	 //write by lirui(是否为主门店)
	 Integer isAddEdit(Integer sId);
}
