package com.lmq.domain;

import java.util.Date;

public class Goodsinstanceprice {
    private Integer id;

    private String ptype;

    private Integer price;

    private String goodsinstanceid;

    private Integer sid;

    private Date time;

    private Integer status;

    private Integer async;

    private String uid;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
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
}