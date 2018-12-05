package com.lmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.GoodsInstanceVo;
import com.lmq.domain.Goodsinstance;

public interface GoodsinstanceMapper {
	//查询商品下单品的详细信息
	public List<Goodsinstance> queryGoodsinstanceInfoByGid(Integer gId) ;
	//查询商品下默认单品
	public Goodsinstance queryOneGoodsInstanceByGid(Integer gId);
	//删除单品根据商品Gid
	public Integer deleteByGid(Integer gId);
	//查询商品下所有单品id集合
	public List<Integer> quertyGoodsInstanceIdsByGid(Integer gId);
	//查询单品信息集合（打印）
	public List<Goodsinstance> queryGoodsInstanceInfoByGid(Integer gId);
	//查询单品价格 (报价>客户类型价格>默认价格) 支持模糊查询 gName为（单品规格和商品名称）
	public List<GoodsInstanceVo> queryGoodsInstanceVoList(@Param("cId") Integer cId,@Param("gName") String gName);
	/**
	 * 自定义
	 */
    int deleteByPrimaryKey(Integer id);
	//单个新增
    int insert(Goodsinstance record);

    int insertSelective(Goodsinstance record);

    Goodsinstance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsinstance record);

    int updateByPrimaryKey(Goodsinstance record);
}