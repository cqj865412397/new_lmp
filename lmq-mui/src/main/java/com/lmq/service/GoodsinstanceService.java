package com.lmq.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.GoodsInstanceVo;
import com.lmq.domain.Goodsinstance;

public interface GoodsinstanceService {
	//查询单品详情
	public List<Goodsinstance> queryGoodsinstanceInfoByGid(Integer gId);
	//批量新增
	//public Integer insertGoodsInstances(List<Goodsinstance> gInList);
	
	//查询商品下默认单品
	public Goodsinstance queryOneGoodsInstanceByGid(Integer gId);
	int insert(Goodsinstance record);
	//删除单品根据商品Gid
	public Integer deleteByGid(Integer gId);

	//查询商品下所有单品id集合
	public List<Integer> quertyGoodsInstanceIdsByGid(Integer gId);
	//查询单品价格 (报价>客户类型价格>默认价格)
	public List<GoodsInstanceVo> queryGoodsInstanceVoList(Integer cId,String gName);
	//查询sid门店下全部单品默认价格
	public List<GoodsInstanceVo> queryGoodsInstanceVoAboutDefPriceList(Integer sId);
	//查询sid门店下单个单品默认价格
    public GoodsInstanceVo querySimGoodsInstanceVoAboutDefPrice(Integer gInId,Integer sId);
  //查询sid门店下单个单品报价
    public GoodsInstanceVo querySimGoodsInstanceVoAboutPrice(Integer gInId,Integer sId,Integer cId);
}
