package com.lmq.service;

import java.util.List;

import com.lmq.domain.Goodstype;

public interface GoodstypeService {
	public List<Goodstype> queryTypeByParentId(Integer parentId);
	
	public List<Goodstype> queryAllParentIdByTid(Integer tId);
}
