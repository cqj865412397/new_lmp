package com.lmq.domain;

import java.util.Date;
import java.util.List;

public class Salesindent {
    private Integer id;

    private Double money;

    private Integer count;

    private String cid;

    private String salesindentnub;

    private Integer sid;

    private Double pid;

    private String remark;

    private Date time;

    private Integer status;

    private Double deposi;

    private String user1;

    private String user2;

    private String user3;

    private String user4;

    private String user5;
    private String stname;
    private List<Salesindentdetails> Salesindentdetails;
    
    private String pname;
    private String cname;
    
    public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}
	
	
    
    public List<Salesindentdetails> getSalesindentdetails() {
		return Salesindentdetails;
	}

	public void setSalesindentdetails(List<Salesindentdetails> salesindentdetails) {
		Salesindentdetails = salesindentdetails;
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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getSalesindentnub() {
        return salesindentnub;
    }

    public void setSalesindentnub(String salesindentnub) {
        this.salesindentnub = salesindentnub;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Double getPid() {
        return pid;
    }

    public void setPid(Double pid) {
        this.pid = pid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Double getDeposi() {
        return deposi;
    }

    public void setDeposi(Double deposi) {
        this.deposi = deposi;
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