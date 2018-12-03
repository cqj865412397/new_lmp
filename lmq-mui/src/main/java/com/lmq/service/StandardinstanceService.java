package com.lmq.service;

import java.util.List;

import com.lmq.domain.Standardinstance;

public interface StandardinstanceService {
	public Integer insert(Standardinstance standardInstance);
	//删除自定义规格值
	public Integer deleteByGid(Integer gId);
	//查询自定义规格值和对应的规格
	public List<Standardinstance> queryStandardListByGid(Integer gId);
}
