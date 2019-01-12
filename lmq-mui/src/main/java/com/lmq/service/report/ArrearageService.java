package com.lmq.service.report;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.report.Arrearage;
import com.lmq.domain.report.Condition;

public interface ArrearageService {
	public List<Arrearage> queryReceipt(Condition c);
	public List<Arrearage> queryReceiptDetail(Condition c);
	public List<Arrearage> queryPay(Condition c);
	public List<Arrearage> queryPayDetail(Condition c);
}
