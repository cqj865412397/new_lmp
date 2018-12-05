package com.lmq.domain;

import java.util.Date;

public class Goodsinstanceprice {
	
	//自定义
	private String pName;//价格中文名称
	//折扣
	private Integer agio;
	
    private Integer id;
    //编号
    private String ptype;

    private Double price;

    private String goodsinstanceid;

    private Integer sid;

    private Date time;

    private Integer status;

    private Integer async;

    private String uid;

    private String user1;

    private String user2;

    private String user3;

    private String user4;

    private String user5;

    
    
    public Integer getAgio() {
		return agio;
	}

	public void setAgio(Integer agio) {
		this.agio = agio;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGoodsinstanceid() {
        return goodsinstanceid;
    }

    public void setGoodsinstanceid(String goodsinstanceid) {
        this.goodsinstanceid = goodsinstanceid;
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
}