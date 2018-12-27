package com.lmq.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Sales {
	private Integer id;

	private Double money;

	private Integer count;

	private String takeinmoney;

	private Integer cid;

	private Integer pid;

	private Integer sid;

	// 创建时间
	private Date time;

	private Integer status;

	private Integer async;

	private String uid;

	// 单据编号
	private String user1;

	// 销售订单编号
	private String user2;
	// 备注
	private String user3;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String user4;
	//实际收款
	private String user5;
	//折扣率
	private String user6;
	
	private String user7;
	private String user8;
	private String user9;
	

	// 详情表集合
	private List<Salesdetails> salesdetails;

	// 店铺名称
	private String stname;
	// 结算账户
	private String pname;
	// 客户名称
	private String cname;
	
	private Integer siId;
	//查询用的 查看当前用户的欠款或者余额
	private Double balance;

	
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getSiId() {
		return siId;
	}

	public void setSiId(Integer siId) {
		this.siId = siId;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Salesdetails> getSalesdetails() {
		return salesdetails;
	}

	public void setSalesdetails(List<Salesdetails> salesdetails) {
		this.salesdetails = salesdetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getTakeinmoney() {
		return takeinmoney;
	}

	public void setTakeinmoney(String takeinmoney) {
		this.takeinmoney = takeinmoney;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAsync() {
		return async;
	}

	public void setAsync(Integer async) {
		this.async = async;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUser1() {
		return user1;
	}

	public void setUser1(String user1) {
		this.user1 = user1;
	}

	public String getUser2() {
		return user2;
	}

	public void setUser2(String user2) {
		this.user2 = user2;
	}

	public String getUser3() {
		return user3;
	}

	public void setUser3(String user3) {
		this.user3 = user3;
	}

	public String getUser4() {
		return user4;
	}

	public void setUser4(String user4) {
		this.user4 = user4;
	}

	public String getUser5() {
		return user5;
	}

	public void setUser5(String user5) {
		this.user5 = user5;
	}

	public String getUser6() {
		return user6;
	}

	public void setUser6(String user6) {
		this.user6 = user6;
	}

	public String getUser7() {
		return user7;
	}

	public void setUser7(String user7) {
		this.user7 = user7;
	}

	public String getUser8() {
		return user8;
	}

	public void setUser8(String user8) {
		this.user8 = user8;
	}

	public String getUser9() {
		return user9;
	}

	public void setUser9(String user9) {
		this.user9 = user9;
	}
	
}