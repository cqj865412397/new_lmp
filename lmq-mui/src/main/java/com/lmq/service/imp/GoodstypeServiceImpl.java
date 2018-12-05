package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.GoodsMapper;
import com.lmq.dao.GoodstypeMapper;
import com.lmq.domain.Goodstype;
import com.lmq.service.GoodstypeService;
@Service
public class GoodstypeServiceImpl implements GoodstypeService{
	
	//==============注入==================
		@Autowired 
		GoodstypeMapper goodstypeMapper;
	//==============注入==================
	
	public List<Goodstype> queryTypeByParentId(Integer parentId) {
		return goodstypeMapper.queryTypeByParentId(parentId);
	}

	public List<Goodstype> queryAllParentIdByTid(Integer tId) {
		return goodstypeMapper.queryAllParentIdByTid(tId);
	}

}
