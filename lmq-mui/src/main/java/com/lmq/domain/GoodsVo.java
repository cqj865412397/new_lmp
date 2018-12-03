package com.lmq.domain;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author lirui
 *扩展类 用于商品新增
 */
public class GoodsVo {
	//商品基本属性
	Goods goods;
	//单品(库存total)
	List<Goodsinstance> gInList;
	//库存
	List<Stock> sList;
	//库存详情
	List<Stockdetail> sDList;
	//无规格商品的价格list
	List<Goodsinstanceprice> priceList;
	
	//图片集合
	List<MultipartFile>imgList;
	//图片路径
	String path;
	
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<MultipartFile> getImgList() {
		return imgList;
	}

	public void setImgList(List<MultipartFile> imgList) {
		this.imgList = imgList;
	}

	public List<Goodsinstanceprice> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<Goodsinstanceprice> priceList) {
		this.priceList = priceList;
	}

	public List<Stock> getsList() {
		return sList;
	}

	public void setsList(List<Stock> sList) {
		this.sList = sList;
	}

	public List<Stockdetail> getsDList() {
		return sDList;
	}

	public void setsDList(List<Stockdetail> sDList) {
		this.sDList = sDList;
	}


	public Goods getGoods() {
		return goods;
	}

	public List<Goodsinstance> getgInList() {
		return gInList;
	}

	public void setgInList(List<Goodsinstance> gInList) {
		this.gInList = gInList;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
}
