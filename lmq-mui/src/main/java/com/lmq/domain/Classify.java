package com.lmq.domain;

import java.util.List;

public class Classify {
	private String acronymname;
	private List<Customer> list;
	private String id;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAcronymname() {
		return acronymname;
	}
	public void setAcronymname(String acronymname) {
		this.acronymname = acronymname;
	}
	public List<Customer> getList() {
		return list;
	}
	public void setList(List<Customer> list) {
		this.list = list;
	}
}
