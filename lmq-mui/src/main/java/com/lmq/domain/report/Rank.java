package com.lmq.domain.report;
/**
 * 排名/统计
 * @author TZX
 *
 */
public class Rank {
	private Double number;	//数值
	private Integer id;
	private String name;	//名称
	private String name2;	//第二名称
	private Double percentage;	//百分比
	public Double getNumber() {
		return number;
	}
	public void setNumber(Double number) {
		this.number = number;
	}
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
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
}
