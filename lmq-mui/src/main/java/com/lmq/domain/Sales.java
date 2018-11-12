package com.lmq.domain;

import java.util.Date;

public class Sales {
    private Integer id;

    private Double money;

    private Integer count;

    private String takeinmoney;

    private Integer cid;

    private Integer pid;

    private Integer sid;

    private Date time;

    private Integer status;

    private Integer async;

    private Double deposi;

    private String uid;

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

    public Double getDeposi() {
        return deposi;
    }

    public void setDeposi(Double deposi) {
        this.deposi = deposi;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}