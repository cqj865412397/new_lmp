package com.lmq.domain.report;
/**
 * 收支
 * @author TZX
 *
 */
public class Income {
	private String name;	//名称	
	private String bh;	//编号
	private String time;	//时间
	private Double money;	//金额
	private String lx;	//类型
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}
	
	
}
