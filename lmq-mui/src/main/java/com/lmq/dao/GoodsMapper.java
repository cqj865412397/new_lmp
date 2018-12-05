package com.lmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Goods;
public interface GoodsMapper {
	
	// 用于查询主页的方法
	public List<Goods> queryGoodsList(@Param("Sid")Integer Sid,@Param("goodsName")String goodsName);
	//查询商品详情
	public Goods queryGoodsInfoByGid(Integer gId);
	//查询商品（in goodsid）
	public List<Goods> queryGoodsListByGoodsIds(Integer[] goodsIds);
	/**
	 * 自动生成的方法
	 */
    int deleteByPrimaryKey(Integer id);
	//新增商品
	public Integer insert(Goods goods);
	
    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKeyWithBLOBs(Goods record);

    int updateByPrimaryKey(Goods record);
}