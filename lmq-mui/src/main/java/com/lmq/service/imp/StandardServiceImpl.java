package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.StandardMapper;
import com.lmq.domain.Goodstype;
import com.lmq.domain.Standard;
import com.lmq.service.GoodstypeService;
import com.lmq.service.StandardService;
@Service
public class StandardServiceImpl implements StandardService{

	//注入
	@Autowired
	StandardMapper standardMapper;
	@Autowired
	GoodstypeService goodstypeService;
	
	
	public List<Standard> queryStandardsBytId(Integer tId) {
		//查询所有父类id
		List<Goodstype> list = goodstypeService.queryAllParentIdByTid(tId);
		
		return standardMapper.queryStandardsBytId(list);
	}


	public Integer insert(Standard record) {
		return standardMapper.insert(record);
	}


	public List<Standard> queryStandardsBytIdAndGid(Integer gId,Integer tId) {
		//查询所有父类id
		List<Goodstype> list = goodstypeService.queryAllParentIdByTid(tId);
		return standardMapper.queryStandardsBytIdAndGid(list, gId);
	}


	public Integer deleteByGid(Integer gId) {
		return standardMapper.deleteByGid(gId);
	}

}
