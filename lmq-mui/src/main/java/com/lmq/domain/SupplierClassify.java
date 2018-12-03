package com.lmq.domain;

import java.util.List;

public class SupplierClassify {
	private String acronymname;
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
	public List<Supplier> getList() {
		return list;
	}
	public void setList(List<Supplier> list) {
		this.list = list;
	}
	private List<Supplier> list;

}
