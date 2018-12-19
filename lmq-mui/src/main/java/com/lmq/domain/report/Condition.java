package com.lmq.domain.report;

import java.util.Calendar;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 *  筛选条件
 * @author TZX
 *
 */
public class Condition {
	private Integer date;		//快速区间-全部0、年1、季2、月3、周4、日5、自定义6
//	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String startdate;	//开始日期
//	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String enddate;		//结束日期
	private Integer customer;	//顾客id 0零售/-1批发
	private Integer supplier;	//供应商id
	private Integer order;	//排序
	private Integer goodstype;	//货品类型-商品类型id
	private Integer goodsid;	//按货品-商品实例id
	private Integer storeid;	//门店id
	private Integer userid;		//登录用户
	
	public Condition() {
		// TODO Auto-generated constructor stub
	}
	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		Date d=new Date();
		switch (date) {
		case 0:	
			this.startdate="1900-1-1";
			this.enddate=(1901+d.getYear())+"-1-1";
			break;
		case 1:	
			this.startdate=(1900+d.getYear())+"-1-1";
			this.enddate=(1901+d.getYear())+"-1-1";
			break;
		case 2:	
			this.startdate=(1900+d.getYear())+"-"+(int)(1+(Math.floor((d.getMonth())/3))*3)+"-1";
			this.enddate=(1901+d.getYear())+"-1-1";
			break;
		case 3:	
			this.startdate=(1900+d.getYear())+"-"+(1+d.getMonth())+"-1";
			this.enddate=(1901+d.getYear())+"-1-1";
			break;
		case 4:	
			this.startdate=(1900+d.getYear())+"-"+(1+d.getMonth())+"-"+(d.getDate()-d.getDay());
			this.enddate=(1901+d.getYear())+"-1-1";
			break;
		case 5:	
			this.startdate=(1900+d.getYear())+"-"+(1+d.getMonth())+"-"+d.getDate();
			this.enddate=(1901+d.getYear())+"-1-1";
			break;
		default:
			break;
		}
		this.date = date;
	}

	
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		if(this.date==6) {
			this.startdate = startdate;
		}
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		if(this.date==6) {
			this.enddate = enddate;
		}
	}
	public Integer getCustomer() {
		return customer;
	}
	
	public void setdiyDate(Date startdate,Date enddate) {
		this.startdate = (1900+startdate.getYear())+"-"+(1+startdate.getMonth())+"-"+startdate.getDate();
		this.enddate = (1900+enddate.getYear())+"-"+(1+enddate.getMonth())+"-"+enddate.getDate();
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
	
	public Integer getStoreid() {
		return storeid;
	}
	public void setStoreid(Integer storeid) {
		this.storeid = storeid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

}
