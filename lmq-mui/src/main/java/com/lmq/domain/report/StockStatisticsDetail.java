package com.lmq.domain.report;
/**
 * 库存详情
 * @author TZX
 *
 */
public class StockStatisticsDetail {
	private String time;
	private String name;
	private String lx;	//进货、出货
	private double price;
	private int count;
	private double sum;
	private int surplusCount;	//结余数量
	private double surplusMoney;	//结余金额
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public int getSurplusCount() {
		return surplusCount;
	}
	public void setSurplusCount(int surplusCount) {
		this.surplusCount = surplusCount;
	}
	public double getSurplusMoney() {
		return surplusMoney;
	}
	public void setSurplusMoney(double surplusMoney) {
		this.surplusMoney = surplusMoney;
	}
	
}
