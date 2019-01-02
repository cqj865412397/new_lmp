package com.lmq.service.imp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.lmq.dao.GoodsMapper;
import com.lmq.dao.StandardinstanceMapper;
import com.lmq.domain.Goods;
import com.lmq.domain.GoodsVo;
import com.lmq.domain.Goodsinstance;
import com.lmq.domain.Goodsinstanceprice;
import com.lmq.domain.Img;
import com.lmq.domain.Standard;
import com.lmq.domain.Standardinstance;
import com.lmq.domain.Stock;
import com.lmq.domain.Stockdetail;
import com.lmq.service.GoodsInstancePriceService;
import com.lmq.service.GoodsService;
import com.lmq.service.GoodsinstanceService;
import com.lmq.service.ImgService;
import com.lmq.service.PriceTypeService;
import com.lmq.service.StandardService;
import com.lmq.service.StandardinstanceService;
import com.lmq.service.StockService;
import com.lmq.service.StockdetailService;
@Service
@Transactional
public class GoodsServiceImpl implements GoodsService{

	//==============注入==================
	@Autowired 
	GoodsMapper goodsMapper;
	@Autowired 
	GoodsinstanceService goodsinstanceService;
	@Autowired
	StockService stockService;
	@Autowired
	StockdetailService stockdetailService;
	@Autowired
	StandardService standardService;
	@Autowired
	StandardinstanceService standardinstanceService;
	@Autowired
	GoodsInstancePriceService goodsInstancePriceService;
	@Autowired
	PriceTypeService priceTypeService;
	@Autowired
	ImgService imgService;
	//==============注入==================
	public List<Goods> queryGoodsList(Integer Sid,String goodsName) {
		List<Goods> list = goodsMapper.queryGoodsList(Sid,goodsName);
		return list;
	}

	public Goods queryGoodsInfoByGid(Integer gId) {
		//查询基本信息（商品名称，编号，类别，单位，创建时间，商品详情）
		Goods goods= goodsMapper.queryGoodsInfoByGid(gId);
		//查询单品详情
		List<Goodsinstance> gInList = goodsinstanceService.queryGoodsinstanceInfoByGid(gId);
		//价格类型列表
		goods.setPriceTypeList(priceTypeService.queryPriceTypeBySid(1));
		goods.setgInList(gInList);
		//一口价商品
		if(gInList.size() == 0) {
			//查询商品下的单品id
			Integer goodsInstanceId = goodsinstanceService.queryOneGoodsInstanceByGid(gId).getId();
			//查询一口价和库存
			//Double firstPrice = goodsInstancePriceService.queryPriceListByGid(goodsInstanceId).get(0).getPrice();
			List<Goodsinstanceprice> priceList = goodsInstancePriceService.queryPriceListByGid(goodsInstanceId);
			Integer count = stockdetailService.queryTotalCountByGoodsInstanceId(goodsInstanceId);
			Double basePrice = stockdetailService.queryInitPriceBygoodsInstanceId(goodsInstanceId).getPrice();
			goods.setPriceList(priceList);
			goods.setCount(count);
			goods.setBasePrice(basePrice);
		}
		return goods;
	}
	
	
	/**
	 * 自动生成方法
	 */
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(GoodsVo goodsVo) {
		//添加商品
		Goods goods = goodsVo.getGoods();
		if(goodsMapper.insert(goods)<=0)
			return 0;
		Integer tid = goods.getTid();
		Integer gid = goods.getId();
		String uid = goods.getUid();
		Integer sid = goods.getSid();
		
		//图片添加（商品id）
		for (MultipartFile file : goodsVo.getImgList()) {
			try {
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmssSSS");
				String time = simpleDateFormat.format(new Date());
				String str = time+"."+file.getContentType().split("/")[1];
				file.transferTo(new File(goodsVo.getPath()+"/"+str));
				// 添加到数据库
				Img img = new Img();
				img.setName(str);
				img.setOldname(file.getOriginalFilename());
				img.setUrl("goods/"+str);//"/static/img/goods/"
				img.setImgtype(1);
				img.setGid(gid);
				img.setGoodsinstanceid(-1);
				img.setStatus(0);
				//默认
				img.setUid("lirui");
				if(imgService.insert(img)<0)
					return 0;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return 0;
			}
		}
		
		
		
		//=====================无规格添加==========================
		if(goodsVo.getgInList() == null || goodsVo.getgInList().size() == 0) {
			//单品
			Goodsinstance g = new Goodsinstance();
			g.setGid(gid);
			g.setStatus(0);
			g.setUid(uid);
			g.setDefaultstate(1);
			if(goodsinstanceService.insert(g)<0)
				return 0;
			//价格
			List<Goodsinstanceprice> priceList= goodsVo.getPriceList();
			for(int n=0;n<priceList.size();n++) {
				priceList.get(n).setGoodsinstanceid(g.getId().toString());
				priceList.get(n).setSid(sid);
				priceList.get(n).setStatus(0);
				priceList.get(n).setUid(uid);
				if(goodsInstancePriceService.insert(priceList.get(n))<0)
					return 0;
			}
			//库存（主表外表详情）
			Stock sm =  new Stock();
			sm.setCode("-1");//批次号
			sm.setAllprice(goods.getCount() * goods.getBasePrice());
			sm.setAllcount(goods.getCount());
			sm.setSid(sid);
			sm.setStatus(0);
			sm.setUid(uid);
			if(stockService.insert(sm)<0)
				return 0;
			Stockdetail s = new Stockdetail();
			s.setGoodsinstanceid(g.getId());
			s.setSid(sm.getId());
			s.setCount(goods.getCount());
			s.setScount(0);
			s.setSum(goods.getCount() * goods.getBasePrice());
			s.setPrice(goods.getBasePrice());
			s.setStatus(0);
			s.setUid(uid);
			if(stockdetailService.insert(s)<0)
				return 0 ;
			return 200;
		}
		
		
		
		
		//=====================有规格添加==========================
		//添加实例（规格值id） 二维码e 条码e DOTO
		//防止重复添加
		HashMap<String, Integer> standardMap = new HashMap<String, Integer>();//规格
		HashMap<String, Integer> standardInstanceMap = new HashMap<String, Integer>();//规格值
		List<Goodsinstance> gInList = goodsVo.getgInList();
		for(int i = 0;i<gInList.size();i++) {
			//默认第一个添加为商品默认单品
			if(i == 0)
				gInList.get(i).setDefaultstate(1);
			else
				gInList.get(i).setDefaultstate(0);
			//Gid
			gInList.get(i).setGid(gid);
			//statues = 0
			gInList.get(i).setStatus(0);
			//uid
			gInList.get(i).setUid(uid);
			//
			String ids = "";
			//规格和规格值的筛选
			String [] standardInstanceArr = gInList.get(i).getIds().split(",");//1/--现在
			for(int j = 0;j<standardInstanceArr.length;j++) {//1/--现在 --你好/--不好",
				//规格和规格值分割
				String [] standardAndStandardIn = standardInstanceArr[j].split("/");//1 --现在
				if(standardAndStandardIn.length !=2) {
					ids+=(standardInstanceArr[j]+",");
					continue;
				}
				for(int k = 0;k<2;k++) {//添加规格和规格值（tid类目，gid）
					if(!Pattern.matches("[0-9]+",standardAndStandardIn[k])) {
						//去除--多余
						standardAndStandardIn[k] = standardAndStandardIn[k].replaceAll("--", "");
						if(k==0) {//规格
							//是否已经添加（防止重复添加）
							if(standardMap.containsKey(standardAndStandardIn[k])) {
								//替换成id
								standardAndStandardIn[k] = standardMap.get(standardAndStandardIn[k]).toString();
								continue;
							}
							Standard standard = new Standard();
							standard.setId(0);
							standard.setName(standardAndStandardIn[k]);
							standard.setTid(tid);
							standard.setGid(gid);
							standard.setUid(uid);
							standard.setStatus(0);
							//规格新增
							if(standardService.insert(standard)>0) {
								standardAndStandardIn[k] = standard.getId().toString();
								standardMap.put(standard.getName(), standard.getId());
							}
							else
								return 0;
						}else{//规格值
							//是否已经添加（防止重复添加）
							if(standardInstanceMap.containsKey(standardAndStandardIn[k])) {
								//替换成id
								standardAndStandardIn[k] = standardInstanceMap.get(standardAndStandardIn[k]).toString();
								ids+=(standardAndStandardIn[k]+",");
								continue;
							}
							Standardinstance standardInstance = new Standardinstance();
							standardInstance.setName(standardAndStandardIn[k]);
							standardInstance.setSid(Integer.parseInt(standardAndStandardIn[0]));
							standardInstance.setGid(gid);
							standardInstance.setStatus(0);
							standardInstance.setUid(uid);
							//规格值新增
							if(standardinstanceService.insert(standardInstance)>0) {
								standardAndStandardIn[k] = standardInstance.getId().toString();
								ids+=(standardAndStandardIn[k]+",");
								standardInstanceMap.put(standardInstance.getName(),standardInstance.getId());
							}
								
							else
								return 0;
						}
					}
				}
			}//单品规格值结束
			//替换成id
			//去逗号
			ids = ids.substring(0, ids.length()-1);
			gInList.get(i).setIds(ids);
			//添加单品
			if(goodsinstanceService.insert(gInList.get(i))<=0)
				return 0;
			else {
				//成功新新增单品
				for (int l = 0; l < gInList.get(i).getPriceList().size(); l++) {
					//设置单品id
					gInList.get(i).getPriceList().get(l).setGoodsinstanceid(gInList.get(i).getId().toString());
					gInList.get(i).getPriceList().get(l).setSid(sid);
					gInList.get(i).getPriceList().get(l).setStatus(0);
				}
			}
			//添加价格(批增)
			List<Goodsinstanceprice> priceList = gInList.get(i).getPriceList();
			if(goodsInstancePriceService.insertPrices(priceList)<=0)
				return 0;
		}
		
		//添加库存(实例id) sid（-1）库存主表编号
		for(int k = 0;k<gInList.size();k++) {
			Stock stock = new Stock();
			stock.setCode("-1");//批次号
			//总共进货价格
			Double allPrice = gInList.get(k).getTotalCount() * gInList.get(k).getBasePrice();
			stock.setAllprice(allPrice);
			stock.setAllcount(gInList.get(k).getTotalCount());
			stock.setSid(sid);
			stock.setStatus(0);
			stock.setUid(uid);
			if(stockService.insert(stock)<=0)
				return 0;
			else {
				//添加库存详情表
				Stockdetail stockdetail = new Stockdetail();
				stockdetail.setGoodsinstanceid(gInList.get(k).getId());
				//主表编号
				stockdetail.setSid(stock.getId());
				stockdetail.setCount(gInList.get(k).getTotalCount());
				stockdetail.setScount(0);
				stockdetail.setSum(gInList.get(k).getTotalCount() * gInList.get(k).getBasePrice());
				stockdetail.setPrice(gInList.get(k).getBasePrice());
				stockdetail.setStatus(0);
				if(stockdetailService.insert(stockdetail)<=0)
					return 0;
			}
		}
		
		//成功添加
		return 200;
	}

	public int insertSelective(Goods record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Goods selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKeySelective(Goods record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeyWithBLOBs(Goods record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(Goods record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Integer updateGoods(GoodsVo goodsVo, Integer gId) {
		//添加新的商品
		if(insert(goodsVo) == 0)
			return 0;
		//删除操作
		//获取goodsInstanceId
		List<Integer> goodsInstanceIds = goodsinstanceService.quertyGoodsInstanceIdsByGid(gId);
		//goods 主键gId
		if(goodsMapper.deleteByPrimaryKey(gId)<=0)
			return 0;
		//goodsinstance单品  Gid
		if(goodsinstanceService.deleteByGid(gId)<=0)
			return 0;
		//goodsinstanceprice 价格 多删除goodsInstanceIdList
		if(goodsInstancePriceService.deleteByIds(goodsInstanceIds)<=0)
			return 0;
		//删除规格（自定义）standard Gid
		if(standardService.deleteByGid(gId) < 0)
			return 0;
		//删除规格值（自定义）standardinstance Gid
		if(standardinstanceService.deleteByGid(gId)<0)
			return 0;
		//图片删除Gid 
		if(imgService.deleteByGid(gId)<0)
			return 0;
		//查询sid库存主表id集合
		List<Integer> stockIds = new ArrayList<Integer>();
		for (Integer gInId : goodsInstanceIds) {
			Integer stockId = stockdetailService.querySid(gInId);
			stockIds.add(stockId);
		}
		//库存从表 list
		if(stockService.deleteByIds(stockIds)<=0)
			return 0;
		//删除主表 list
		if(stockdetailService.deleteByGoodsInstanceIds(goodsInstanceIds)<=0)
			return 0;
		//修改成功
		return 200;
	}

	public List<Goods> queryGoodsListByGoodsIds(Integer[] goodsIds) {
		return goodsMapper.queryGoodsListByGoodsIds(goodsIds);
	}

	@Override
	public Integer deleteGoods(Integer gId) {
		/**
		 * 删除逻辑
		 * 1.没有销售记录
		 * 2.没有进货记录
		 */
		
		return 0;
	}




	
	
}
