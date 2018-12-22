package com.lmq.service;

import java.util.List;

import com.lmq.domain.Goodstype;
import com.lmq.domain.StandardVO;

public interface GoodstypeService {
	public List<Goodstype> queryTypeByParentId(Integer parentId);
	
	public List<Goodstype> queryAllParentIdByTid(Integer tId);
	//查询顶级类目
	public List <Goodstype>  queryGoodstypeTop();
	//添加类目（动态.包含修改类目，删除类目，新增类目）
	public Integer addStype(StandardVO standardVO);
}
