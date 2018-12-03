package com.lmq.dao;

import com.lmq.domain.Img;

public interface ImgMapper {
	
	//删除所有图片gid
	public Integer deleteByGid(Integer gId);
	
	
	
    int deleteByPrimaryKey(Integer id);

    int insert(Img record);

    int insertSelective(Img record);

    Img selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);
}