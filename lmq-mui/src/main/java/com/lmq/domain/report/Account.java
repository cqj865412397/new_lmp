package com.lmq.domain.report;

import java.util.List;

/**
 * 账单
 * @author TZX
 *
 */
public class Account {
	private Integer id;		//客户（供应商）id
	private String name;	//客户（供应商）名称
	private String lx;	//交易类型
	private String bh;	//交易编号
	private String time;	//时间
	private double initMoney;
	private double addMoney;
	private double backMoney;
	private double finalMoney;
	private List<EasyGoods> list;	//账单详情
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getInitMoney() {
		return initMoney;
	}
	public void setInitMoney(double initMoney) {
		this.initMoney = initMoney;
	}
	public double getAddMoney() {
		return addMoney;
	}
	public void setAddMoney(double addMoney) {
		this.addMoney = addMoney;
	}
	public double getBackMoney() {
		return backMoney;
	}
	public void setBackMoney(double backMoney) {
		this.backMoney = backMoney;
	}
	public double getFinalMoney() {
		return finalMoney;
	}
	public void setFinalMoney(double finalMoney) {
		this.finalMoney = finalMoney;
	}
	public List<EasyGoods> getList() {
		return list;
	}
	public void setList(List<EasyGoods> list) {
		this.list = list;
	}
	
}
