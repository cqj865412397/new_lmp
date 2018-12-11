package com.lmq.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Goodstype;
import com.lmq.domain.Standard;

public interface StandardService {

	//查询规格
	public List<Standard> queryStandardsBytId(Integer tId);
	//新增
	public Integer insert(Standard standard);
	//
	public List<Standard> queryStandardsBytIdAndGid(Integer gId,Integer tId);
	//删除自定义规格
	public Integer deleteByGid(Integer gId);
	//查询添加分类时，父类tid（包含本类目）所有类目下的属性
	public List<Standard> queryALLStandardByTid(Integer tId);
}
