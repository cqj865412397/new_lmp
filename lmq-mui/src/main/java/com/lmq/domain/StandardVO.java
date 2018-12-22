package com.lmq.domain;

import java.util.List;

/*
 * 处理类别下规格修改
 * */
public class StandardVO {
	private Integer tId;
	private List<Standard> oldStandard;//修改修改之前
	private List<Standard> newStandard;//修改之后
	private Integer[] deleteStandardId;//规格id集合
	private Integer[] deleteStandardInId;//规格值id集合
	private String stypeName; //类目名称
	
	
	
	public String getStypeName() {
		return stypeName;
	}
	public void setStypeName(String stypeName) {
		this.stypeName = stypeName;
	}
	public Integer[] getDeleteStandardId() {
		return deleteStandardId;
	}
	public void setDeleteStandardId(Integer[] deleteStandardId) {
		this.deleteStandardId = deleteStandardId;
	}
	public Integer[] getDeleteStandardInId() {
		return deleteStandardInId;
	}
	public void setDeleteStandardInId(Integer[] deleteStandardInId) {
		this.deleteStandardInId = deleteStandardInId;
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public List<Standard> getOldStandard() {
		return oldStandard;
	}
	public void setOldStandard(List<Standard> oldStandard) {
		this.oldStandard = oldStandard;
	}
	public List<Standard> getNewStandard() {
		return newStandard;
	}
	public void setNewStandard(List<Standard> newStandard) {
		this.newStandard = newStandard;
	}
	
}
