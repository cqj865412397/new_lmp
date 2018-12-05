package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.StandardinstanceMapper;
import com.lmq.domain.Standardinstance;
import com.lmq.service.StandardinstanceService;
@Service
public class StandardinstanceServiceImpl implements StandardinstanceService{

	@Autowired
	StandardinstanceMapper standardinstanceMapper;
	
	public Integer insert(Standardinstance standardInstance) {
		return standardinstanceMapper.insert(standardInstance);
	}

	public Integer deleteByGid(Integer gId) {
		return standardinstanceMapper.deleteByGid(gId);
	}

	public List<Standardinstance> queryStandardListByGid(Integer gId) {
		return standardinstanceMapper.queryStandardListByGid(gId);
	}

}
