package com.lmq.domain;
/**
 * 
 * @author lirui
 *	�û��Կͻ����ۺͳµ�Ʒ����
 */
public class GoodsInstanceVo {
	//��Ʒ����
	String goodsName;
	//��Ʒ����������
	String standardName;
	//���ֵids
	String ids;
	//��Ʒid
	Integer goodsInstanceId;
	//����
	Double money;
	

	//�۸�����id
	Integer Ptype; 
	//�۸�����
	String priceName;
	//�۸�(���ۺʹ����������)
	Double price;
	//�Ƿ�ΪĬ�ϼ۸�
	Integer DefaultPrice;
	
	//ͼƬ��ַ
	String url;
	//��λ����
	String bitName;
	
	Integer qid;
	
	//商品价格一口价格（yikoujia）
	Double primePrice;
	
	public Double getPrimePrice() {
		return primePrice;
	}
	public void setPrimePrice(Double primePrice) {
		this.primePrice = primePrice;
	}
	public String getBitName() {
		return bitName;
	}
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
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
