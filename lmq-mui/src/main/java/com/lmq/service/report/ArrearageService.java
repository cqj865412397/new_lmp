package com.lmq.service.report;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.report.Arrearage;

public interface ArrearageService {
	public List<Arrearage> queryReceipt(String starttime,String endtime);
	public List<Arrearage> queryReceiptDetail(Integer cid,String starttime,String endtime);
	public List<Arrearage> queryPay(String starttime,String endtime);
	public List<Arrearage> queryPayDetail(Integer sid,String starttime,String endtime);
}
