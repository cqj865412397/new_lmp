package com.lmq.domain.report;

import java.util.List;

import com.lmq.domain.Standard;

/**
 * 销售&进货
 * @author TZX
 *
 */
public class SalesStock {
	private Integer goodsinstanceid;	//商品实例id
	private Integer gid;	//商品id
	private String gname;	//商品名称
	private String standardName; //规格名称
	private Integer count;	//数量
	private String bname;	//单位
	private Double paymoney;	//折后应收-支付金额
	
	//明细使用：
	private Integer cid;	//客户id
	private String cname;	//客户名
	private String sid;	//销售单号id
	private String time;	//销售单日期
	private Double money;	//原价
	
	private Integer supplierid;		//供应商id
	private String suppliername;	//供应商名称
	private Integer stockid;	//进货单号id
	private String scode;	//进货单批次code
	public Integer getGoodsinstanceid() {
		return goodsinstanceid;
	}
	public void setGoodsinstanceid(Integer goodsinstanceid) {
		this.goodsinstanceid = goodsinstanceid;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getStandardName() {
		return standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Double getPaymoney() {
		return paymoney;
	}
	public void setPaymoney(Double paymoney) {
		this.paymoney = paymoney;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public Integer getStockid() {
		return stockid;
	}
	public void setStockid(Integer stockid) {
		this.stockid = stockid;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	
	
}
