package com.lmq.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.ImgMapper;
import com.lmq.domain.Img;
import com.lmq.service.ImgService;
@Service
public class ImgServiceImpl implements ImgService{

	@Autowired
	ImgMapper imgMapper;
	public int insert(Img record) {
		return imgMapper.insert(record);
	}
	public Integer deleteByGid(Integer gId) {
		return imgMapper.deleteByGid(gId);
	}
	
}
