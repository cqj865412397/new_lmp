package com.lmq.domain.report;

import java.util.List;

/**
 * 库存统计
 * @author TZX
 *
 */
public class StockStatistics {
	private Integer gid;
	private String gname;
	private String standardName;	//商品规格名称
	private String bname;	//单位名称
	private Integer initCount;
	private double initMoney;
	private Integer addCount;	//进货
	private double addtMoney;
	private Integer backCount;	//出货
	private double backMoney;
	private Integer finalCount;	//期末/最终
	private double finaltMoney;
	private List<StockStatisticsDetail> list;
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
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Integer getInitCount() {
		return initCount;
	}
	public void setInitCount(Integer initCount) {
		this.initCount = initCount;
	}
	public double getInitMoney() {
		return initMoney;
	}
	public void setInitMoney(double initMoney) {
		this.initMoney = initMoney;
	}
	public Integer getAddCount() {
		return addCount;
	}
	public void setAddCount(Integer addCount) {
		this.addCount = addCount;
	}
	public double getAddtMoney() {
		return addtMoney;
	}
	public void setAddtMoney(double addtMoney) {
		this.addtMoney = addtMoney;
	}
	public Integer getBackCount() {
		return backCount;
	}
	public void setBackCount(Integer backCount) {
		this.backCount = backCount;
	}
	public double getBackMoney() {
		return backMoney;
	}
	public void setBackMoney(double backMoney) {
		this.backMoney = backMoney;
	}
	public Integer getFinalCount() {
		return finalCount;
	}
	public void setFinalCount(Integer finalCount) {
		this.finalCount = finalCount;
	}
	public double getFinaltMoney() {
		return finaltMoney;
	}
	public void setFinaltMoney(double finaltMoney) {
		this.finaltMoney = finaltMoney;
	}
	public List<StockStatisticsDetail> getList() {
		return list;
	}
	public void setList(List<StockStatisticsDetail> list) {
		this.list = list;
	}
	
	
}
