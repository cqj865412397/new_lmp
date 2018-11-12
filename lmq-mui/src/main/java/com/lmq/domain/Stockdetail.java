package com.lmq.domain;

import java.util.Date;

public class Stockdetail {
    private Integer id;

    private Integer goodsinstanceid;

    private Integer sid;

    private Integer count;

    private Date scount;

    private Double sum;

    private Double price;

    private Integer status;

    private Integer async;

    private String uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsinstanceid() {
        return goodsinstanceid;
    }

    public void setGoodsinstanceid(Integer goodsinstanceid) {
        this.goodsinstanceid = goodsinstanceid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getScount() {
        return scount;
    }

    public void setScount(Date scount) {
        this.scount = scount;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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