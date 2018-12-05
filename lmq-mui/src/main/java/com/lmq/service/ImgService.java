package com.lmq.service;

import com.lmq.domain.Img;

public interface ImgService {
	//新增
    int insert(Img record);
  //删除所有图片gid
  	public Integer deleteByGid(Integer gId);
}
