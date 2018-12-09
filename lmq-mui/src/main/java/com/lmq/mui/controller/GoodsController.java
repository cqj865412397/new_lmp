package com.lmq.mui.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.lmq.domain.Bit;
import com.lmq.domain.Goods;
import com.lmq.domain.GoodsInstanceVo;
import com.lmq.domain.GoodsVo;
import com.lmq.domain.Goodstype;
import com.lmq.domain.Pricetype;
import com.lmq.domain.Standard;
import com.lmq.domain.Standardinstance;
import com.lmq.service.BitService;
import com.lmq.service.GoodsService;
import com.lmq.service.GoodsinstanceService;
import com.lmq.service.GoodstypeService;
import com.lmq.service.PriceTypeService;
import com.lmq.service.StandardService;
import com.lmq.service.StandardinstanceService;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	// ========注入========
	@Autowired
	GoodsService goodsService;
	@Autowired
	GoodsinstanceService goodsinstanceService;
	@Autowired
	BitService bitService;
	@Autowired
	GoodstypeService goodstypeService;
	@Autowired
	StandardService standardService;
	@Autowired
	PriceTypeService priceTypeService;
	@Autowired
	StandardinstanceService standardinstanceService;

	// ========注入end========
	// 查询货物主页数据
	@RequestMapping("/queryGoodsHome")
	public List<Goods> queryGoodsHome(String goodsName) {
		// System.out.println(goodsName);
		List<Goods> list = goodsService.queryGoodsList(1, goodsName);
		return list;
	}

	// 查询商品详情数据
	@RequestMapping("/queryGoodsInfo")
	public Goods queryGoodsInfo(Integer gId) {
		Goods g = goodsService.queryGoodsInfoByGid(gId);
		return g;
	}

	// 单位查询
	@RequestMapping("/queryBitBySid")
	public List<Bit> queryBitBySid() {
		List<Bit> list = bitService.queryBitBySid(1);
		return list;
	}

	// 类目查询
	@RequestMapping("/queryGoodstypeByParentId")
	public List<Goodstype> queryGoodstypeByParentId() {
		List<Goodstype> list = goodstypeService.queryTypeByParentId(0);
		return list;
	}

	// 查询规格(常规类目下的规格)
	@RequestMapping("/queryStandardsBytId")
	public List<Standard> queryStandardsBytId(Integer tId) {
		// 查询类别下的规格
		List<Standard> list = standardService.queryStandardsBytId(tId);
		return list;
	}

	// 查询规格(全部规格)
	@RequestMapping("/queryAllStandardsBytId")
	public List<Standard> queryAllStandardsBytId(Integer tId, Integer gId) {
		// 查询类别下的规格
		List<Standard> list = standardService.queryStandardsBytIdAndGid(gId, tId);
		// 查询自定义规格
		/*
		 * List<Standard> selfList =standardService.queryStandardsBytIdAndGid(gId,tId);
		 * selfList.addAll(list);
		 */
		return list;// selfList;
	}

	// 查询价格类型
	@RequestMapping("/queryPriceTypeBySid")
	public List<Pricetype> queryPriceTypeBySid(Integer sId) {
		List<Pricetype> list = priceTypeService.queryPriceTypeBySid(1);
		return list;
	}

	// 查询自定义规格值
	@RequestMapping("/queryStandardListByGid")
	public List<Standardinstance> queryStandardListByGid(Integer gId) {
		List<Standardinstance> list = standardinstanceService.queryStandardListByGid(gId);
		return list;
	}

	// 查询打印单品内容
	@RequestMapping("/queryGoodsAboutPrinter")
	public List<Goods> queryGoodsAboutPrinter(Integer[] goodsIds) {
		List<Goods> list = goodsService.queryGoodsListByGoodsIds(goodsIds);
		return list;
	}

	// 查询单品各个价格
	@RequestMapping("/queryGoodsInstanceVoList")
	public List<GoodsInstanceVo> queryGoodsInstanceVoList(Integer cId, String gName) {
		List<GoodsInstanceVo> list = goodsinstanceService.queryGoodsInstanceVoList(cId, gName);
		return list;
	}

	// 查询sid门店下全部单品（默认价格）
	@RequestMapping("/queryGoodsInstanceVoAboutDefPriceList")
	public List<GoodsInstanceVo> queryGoodsInstanceVoAboutDefPriceList(Integer sId) {
		List<GoodsInstanceVo> list = goodsinstanceService.queryGoodsInstanceVoAboutDefPriceList(sId);
		return list;
	}
	
	//查询sid门店下单个单品（默认价格）
	@RequestMapping("/querySimGoodsInstanceVoAboutDefPrice")
	public GoodsInstanceVo querySimGoodsInstanceVoAboutDefPrice(Integer gInId,Integer sId) {
		GoodsInstanceVo gIn = goodsinstanceService.querySimGoodsInstanceVoAboutDefPrice(gInId, sId);
		return gIn;
	}
	//查询sid门店下单个单品（报价）
	@RequestMapping("/querySimGoodsInstanceVoAboutPrice")
	public GoodsInstanceVo querySimGoodsInstanceVoAboutPrice(Integer gInId, Integer sId, Integer cId) {
		GoodsInstanceVo gIn = goodsinstanceService.querySimGoodsInstanceVoAboutPrice(gInId, sId, cId);
		return gIn;
	}
	// 添加单位
	@RequestMapping("/addBit")
	public Integer addBit(String name) {
		Bit bit = new Bit();
		bit.setSid(1);
		bit.setName(name);
		bit.setStatus(0);
		return bitService.insert(bit);
	}

	// ================添加商品(包含图片上传)======================
	@RequestMapping(value = "/addGoods")
	public String addGoods(MultipartFile file1, // @RequestParam("file1")
			MultipartFile file2, MultipartFile file3, MultipartFile file4, MultipartFile file5, String goodsV,
			HttpSession session) {// GoodsVo goodsVo
		// 模拟数据DOTO
		GoodsVo goodsvo = JSON.parseObject(goodsV, GoodsVo.class);
		goodsvo.getGoods().setUid("lirui");
		goodsvo.getGoods().setSid(1);
		// 设置图片路径
		String path = "D:/img/goods";// session.getServletContext().getRealPath("/static/img/goods");
		goodsvo.setPath(path);
		File file = new File(path);
		if (!file.isDirectory()) {
			file.mkdirs();
		}
		// 设置图片
		List<MultipartFile> imgList = new ArrayList<MultipartFile>();
		if (file1 != null)
			imgList.add(file1);
		if (file2 != null)
			imgList.add(file2);
		if (file3 != null)
			imgList.add(file3);
		if (file4 != null)
			imgList.add(file4);
		if (file5 != null)
			imgList.add(file5);
		goodsvo.setImgList(imgList);
		// 默认数据有效
		goodsvo.getGoods().setStatus(0);

		Integer isGoods = goodsService.insert(goodsvo);
		if (isGoods == 200)
			return "200";// "{\"status\":200,\"gid\":"+goodsV.getGoods().getId()+"}";//成功
		else
			return "0";// 添加失败
	}

	// ================修改商品(包含图片上传)======================
	@RequestMapping(value = "/updateGoods")
	public String updateGoods(MultipartFile file1, // @RequestParam("file1")
			MultipartFile file2, MultipartFile file3, MultipartFile file4, MultipartFile file5, String goodsV,
			String gId, // 修改的商品id
			HttpSession session) {
		// 模拟数据DOTO
		GoodsVo goodsvo = JSON.parseObject(goodsV, GoodsVo.class);
		goodsvo.getGoods().setUid("lirui");
		goodsvo.getGoods().setSid(1);
		// 设置图片路径
		String path = "D:/img/goods";// session.getServletContext().getRealPath("/static/img/goods");
		File file = new File(path);
		if (!file.isDirectory()) {
			file.mkdirs();
		}
		goodsvo.setPath(path);
		// 设置图片
		List<MultipartFile> imgList = new ArrayList<MultipartFile>();
		if (file1 != null)
			imgList.add(file1);
		if (file2 != null)
			imgList.add(file2);
		if (file3 != null)
			imgList.add(file3);
		if (file4 != null)
			imgList.add(file4);
		if (file5 != null)
			imgList.add(file5);
		goodsvo.setImgList(imgList);
		// 默认数据有效
		goodsvo.getGoods().setStatus(0);

		Integer isGoods = goodsService.updateGoods(goodsvo, Integer.parseInt(gId));
		if (isGoods == 200)
			return "200";// "{\"status\":200,\"gid\":"+goodsV.getGoods().getId()+"}";//成功
		else
			return "0";// 修改失败
	}
}
