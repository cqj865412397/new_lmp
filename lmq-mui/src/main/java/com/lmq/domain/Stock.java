package com.lmq.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Stock {
    private Integer id;

    private String code;

    private Double allprice;

    private Integer allcount;

    private Date time;

    private Integer sid;

    private Integer supid;

    private Integer status;

    private Integer async;

    private String uid;
    
    //单内时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String user1;
    //应付款
    private String user2;
    //实付款
    private String user3;

    private String user4;

    private String user5;
    
	private String user6;
	
	private String user7;
	private String user8;
	private String user9;
    private String spname;
    
    private List<Stockdetail> stockdetails;
    
    
	public List<Stockdetail> getStockdetails() {
		return stockdetails;
	}

	public void setStockdetails(List<Stockdetail> stockdetails) {
		this.stockdetails = stockdetails;
	}

	public String getSpname() {
		return spname;
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

	public void setSpname(String spname) {
		this.spname = spname;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getAllprice() {
        return allprice;
    }

    public void setAllprice(Double allprice) {
        this.allprice = allprice;
    }

    public Integer getAllcount() {
        return allcount;
    }

    public void setAllcount(Integer allcount) {
        this.allcount = allcount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getSupid() {
        return supid;
    }

    public void setSupid(Integer supid) {
        this.supid = supid;
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