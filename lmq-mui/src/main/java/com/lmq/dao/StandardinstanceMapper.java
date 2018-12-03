package com.lmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Standardinstance;

public interface StandardinstanceMapper {
	//查询商品下全部规格值（自定义和非自定义）
	public List<Standardinstance> querystandardInstanceBySid(@Param("sId")Integer sId,@Param("gId")Integer gId);
	//删除自定义规格值
	public Integer deleteByGid(Integer gId);
	//查询自定义规格值和对应的规格
	public List<Standardinstance> queryStandardListByGid(Integer gId);
	
	
	/***
	 * 自动生成
	 */
    int deleteByPrimaryKey(Integer id);

    int insert(Standardinstance record);

    int insertSelective(Standardinstance record);

    Standardinstance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Standardinstance record);

    int updateByPrimaryKey(Standardinstance record);
}