package com.lmq.service;

import java.util.List;


import com.lmq.domain.Goods;
import com.lmq.domain.GoodsVo;

public interface GoodsService {
	
	//查询商品列表
	public List<Goods> queryGoodsList(Integer Sid,String goodsName);
	//查询商品详情
	public Goods queryGoodsInfoByGid(Integer gId);
	//修改商品
	public Integer updateGoods(GoodsVo goodsVo,Integer gId);
	//查询商品（in goodsid）
	public List<Goods> queryGoodsListByGoodsIds(Integer[] goodsIds);
	//删除商品(根据主键id)
	public Integer deleteGoods(Integer gId);
	/**
	 * 自动生成方法
	 */
	int deleteByPrimaryKey(Integer id);
	//添加商品
    int insert(GoodsVo goodsVo);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKeyWithBLOBs(Goods record);

    int updateByPrimaryKey(Goods record);
}
