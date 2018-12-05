package com.lmq.domain;

import java.util.List;

import com.lmq.domain.zjf.QuotedPrice;

public class QuotedPriceClass {
	private String acronymname;
	private String id;
	private List<QuotedPrice> list;
	public String getAcronymname() {
		return acronymname;
	}
	public void setAcronymname(String acronymname) {
		this.acronymname = acronymname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<QuotedPrice> getList() {
		return list;
	}
	public void setList(List<QuotedPrice> list) {
		this.list = list;
	}
}
