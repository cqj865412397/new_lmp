package com.lmq.domain;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author lirui
 *��չ�� ������Ʒ����
 */
public class GoodsVo {
	//��Ʒ��������
	Goods goods;
	//��Ʒ(���total)
	List<Goodsinstance> gInList;
	//���
	List<Stock> sList;
	//�������
	List<Stockdetail> sDList;
	//�޹����Ʒ�ļ۸�list
	List<Goodsinstanceprice> priceList;
	
	//ͼƬ����
	List<MultipartFile>imgList;
	//ͼƬ·��
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
