package com.lmq.domain;
/**
 * 
 * @author lirui
 *	用户赵客户报价和陈单品报价
 */
public class GoodsInstanceVo {
	//商品名称
	String goodsName;
	//单品规格组成名称
	String standardName;
	//规格值ids
	String ids;
	//单品id
	Integer goodsInstanceId;
	//报价
	Double money;
	

	//价格类型id
	Integer Ptype; 
	//价格名称
	String priceName;
	//价格(零售和打包和批发等)
	Double price;
	//是否为默认价格
	Integer DefaultPrice;
	
	//图片地址
	String url;
	//单位名称
	String bitName;
	
	
	public String getBitName() {
		return bitName;
	}
	public void setBitName(String bitName) {
		this.bitName = bitName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getStandardName() {
		return standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public Integer getGoodsInstanceId() {
		return goodsInstanceId;
	}
	public void setGoodsInstanceId(Integer goodsInstanceId) {
		this.goodsInstanceId = goodsInstanceId;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getPtype() {
		return Ptype;
	}
	public void setPtype(Integer ptype) {
		Ptype = ptype;
	}
	public String getPriceName() {
		return priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getDefaultPrice() {
		return DefaultPrice;
	}
	public void setDefaultPrice(Integer defaultPrice) {
		DefaultPrice = defaultPrice;
	}
	
}
