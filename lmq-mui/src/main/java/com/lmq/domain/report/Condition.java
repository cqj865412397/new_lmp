package com.lmq.domain.report;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 *  筛选条件
 * @author TZX
 *
 */
public class Condition {
	private String date;		//日期
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startdate;	//开始日期
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date enddate;		//结束日期
	private Integer customer;	//顾客id 0零售/1批发
	private Integer supplier;	//供应商
	private Integer order;	//排序
	private Integer goodstype;	//货品类型-商品类型id
	private Integer goodsid;	//按货品-商品实例id
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Integer getCustomer() {
		return customer;
	}

	public void setCustomer(Integer customer) {
		this.customer = customer;
	}

	public Integer getSupplier() {
		return supplier;
	}

	public void setSupplier(Integer supplier) {
		this.supplier = supplier;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Integer getGoodstype() {
		return goodstype;
	}

	public void setGoodstype(Integer goodstype) {
		this.goodstype = goodstype;
	}

	public Integer getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}
	

}
