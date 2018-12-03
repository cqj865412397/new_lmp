package com.lmq.domain.zjf;

import java.util.List;

import com.lmq.domain.Standard;
import com.lmq.domain.Standardinstance;

public class QuotedPrice {
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// 商品名称
	private String gname;
	// 客户名称
	private String name;
	// 商品图片
	private String url;
	// 报价
	private Double price;
	// 商品属性名
	private List<Standard> standardlist;
	// 商品属性值
	private List<Standardinstance> list;

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Standard> getStandardlist() {
		return standardlist;
	}

	public void setStandardlist(List<Standard> standardlist) {
		this.standardlist = standardlist;
	}

	public List<Standardinstance> getList() {
		return list;
	}

	public void setList(List<Standardinstance> list) {
		this.list = list;
	}
}
