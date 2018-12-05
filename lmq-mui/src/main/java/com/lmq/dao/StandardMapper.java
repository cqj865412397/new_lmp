package com.lmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Goodstype;
import com.lmq.domain.Standard;

public interface StandardMapper {
	//查询
	public List<Standard> queryStandardsBytId(List<Goodstype> list);
	//查询规格对象（包含规格值集合）
	public List<Standard> queryStandardsBytIdAndGid(@Param("list")List<Goodstype> list,@Param("gId") Integer gId);
	//删除自定义规格
	public Integer deleteByGid(Integer gId);
	
	
	/**
	 * 自动生成
	 */
	
    int deleteByPrimaryKey(Integer id);

    int insert(Standard record);

    int insertSelective(Standard record);

    Standard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Standard record);

    int updateByPrimaryKey(Standard record);
}