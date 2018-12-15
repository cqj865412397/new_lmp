package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.GoodsMapper;
import com.lmq.dao.GoodsinstanceMapper;
import com.lmq.domain.GoodsInstanceVo;
import com.lmq.domain.Goodsinstance;
import com.lmq.service.GoodsinstanceService;
@Service
public class GoodsinstanceServiceImpl implements GoodsinstanceService{

	//==============注入==================
		@Autowired 
		GoodsinstanceMapper goodsinstanceMapper;
	//==============注入==================
	
	
	public List<Goodsinstance> queryGoodsinstanceInfoByGid(Integer gId) {
		return goodsinstanceMapper.queryGoodsinstanceInfoByGid(gId);
	}


	public int insert(Goodsinstance record) {
		return goodsinstanceMapper.insert(record);
	}


	public Goodsinstance queryOneGoodsInstanceByGid(Integer gId) {
		return goodsinstanceMapper.queryOneGoodsInstanceByGid(gId);
	}


	public Integer deleteByGid(Integer gId) {
		return goodsinstanceMapper.deleteByGid(gId);
	}


	public List<Integer> quertyGoodsInstanceIdsByGid(Integer gId) {
		return goodsinstanceMapper.quertyGoodsInstanceIdsByGid(gId);
	}


	public List<GoodsInstanceVo> queryGoodsInstanceVoList(Integer cId,String gName) {
		return goodsinstanceMapper.queryGoodsInstanceVoList(cId,gName);
	}
	
	public List<GoodsInstanceVo> queryGoodsInstanceVoAboutDefPriceList(Integer sId) {
		return goodsinstanceMapper.queryGoodsInstanceVoAboutDefPriceList(sId);
	}


	@Override
	public GoodsInstanceVo querySimGoodsInstanceVoAboutDefPriceAndPrice(Integer gInId, Integer sId, Integer cId) {
		return goodsinstanceMapper.querySimGoodsInstanceVoAboutDefPriceAndPrice(gInId, sId, cId);
	}


	@Override
	public List<GoodsInstanceVo> queryAllGoodsInstanceBySid(Integer sId, String gName) {
		return goodsinstanceMapper.queryAllGoodsInstanceBySid(sId, gName);
	}


	

	

}
