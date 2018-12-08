package com.lmq.domain.report;
/**
 * 欠款
 * @author TZX
 *
 */
public class Arrearage {
	private Integer id;
	private String name;
	private double initMoney;	//期初
	private Double addMoney;	//增加
	private Double backMoney;	//回收
	private Double finalMoney;	//期末
	private String time;
	
	//用于详情
	private String reason;	//原因
	private String bh;	//业务编号
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
	public double getInitMoney() {
		return initMoney;
	}
	public void setInitMoney(double initMoney) {
		this.initMoney = initMoney;
	}
	public Double getAddMoney() {
		return addMoney;
	}
	public void setAddMoney(Double addMoney) {
		this.addMoney = addMoney;
	}
	public Double getBackMoney() {
		return backMoney;
	}
	public void setBackMoney(Double backMoney) {
		this.backMoney = backMoney;
	}
	public Double getFinalMoney() {
		return finalMoney;
	}
	public void setFinalMoney(Double finalMoney) {
		this.finalMoney = finalMoney;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	
}
