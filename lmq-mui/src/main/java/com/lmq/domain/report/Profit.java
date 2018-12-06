package com.lmq.domain.report;

/**
 * 利润
 * @author TZX
 *
 */
public class Profit {
	private Double paymoney;	//实际支付金额
	private Double money;	//原价
	private Double costmoney;	//成本
	private Double profit;	//利润
	private Double profitability;	//利润率
	private String time;	//交易时间
	
	private Integer cid;	//客户id
	private String cname;	//客户姓名
	
	private Integer goodsinstanceid;	//商品实例id
	private String gname;	//商品名称
	private String standardName;	//商品规格名称
	private Integer count;	//数量
	private String bname;	//单位名称
	
	private Integer sid;	//销售单编号
	public Double getPaymoney() {
		return paymoney;
	}
	public void setPaymoney(Double paymoney) {
		this.paymoney = paymoney;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Double getCostmoney() {
		return costmoney;
	}
	public void setCostmoney(Double costmoney) {
		this.costmoney = costmoney;
	}
	public Double getProfit() {
		return profit;
	}
	public void setProfit(Double profit) {
		this.profit = profit;
	}
	public Double getProfitability() {
		return profitability;
	}
	public void setProfitability(Double profitability) {
		this.profitability = profitability;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time.substring(0, 10);
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
	public Integer getGoodsinstanceid() {
		return goodsinstanceid;
	}
	public void setGoodsinstanceid(Integer goodsinstanceid) {
		this.goodsinstanceid = goodsinstanceid;
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
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
}
