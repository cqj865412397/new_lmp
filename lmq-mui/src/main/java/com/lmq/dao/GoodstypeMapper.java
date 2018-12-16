package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Goodstype;

public interface GoodstypeMapper {
	// 用于查询类别
	public List<Goodstype> queryTypeByParentId(Integer parentId);
	
	//查询所有父类id（包含本类id）
	public List<Goodstype> queryAllParentIdByTid(Integer tId);
	//查询顶级类目
	public List <Goodstype>  queryGoodstypeTop();
	
	/**
	 * 自动生成的方法
	 */
    int deleteByPrimaryKey(Integer id);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    Goodstype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);
}