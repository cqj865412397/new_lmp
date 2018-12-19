package com.lmq.service;

import java.util.List;

import com.lmq.domain.Paytype;

public interface PayTypeService {

	    List<Paytype> queryAll();
	    
	    List<Paytype> queryByUserid(Paytype obj);
	    
	    
		public int insertSelective(Paytype record);
	    
	    int deleteByPrimaryKey(Integer id);
}
