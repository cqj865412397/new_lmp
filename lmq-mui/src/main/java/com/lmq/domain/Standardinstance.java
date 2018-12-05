package com.lmq.domain;

import java.util.Date;

public class Standardinstance {
	
	//规格名称
	String standardName;
	//规格id
	Integer standardId;
	//规格Gid
	Integer standardGid;
	
    private Integer id;

    private String name;

    private Integer sid;

    private Integer gid;

    private Date time;

    private Integer status;

    private Integer async;

    private String uid;

    private String user1;

    private String user2;

    private String user3;

    private String user4;

    private String user5;

    
    public Integer getStandardGid() {
		return standardGid;
	}


	public void setStandardGid(Integer standardGid) {
		this.standardGid = standardGid;
	}


	public Integer getId() {
        return id;
    }

    
    public String getStandardName() {
		return standardName;
	}


	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}


	public Integer getStandardId() {
		return standardId;
	}


	public void setStandardId(Integer standardId) {
		this.standardId = standardId;
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

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
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