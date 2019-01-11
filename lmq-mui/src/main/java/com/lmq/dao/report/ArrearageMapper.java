package com.lmq.dao.report;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.report.Arrearage;
import com.lmq.domain.report.Condition;
/**
 * 应收/付欠款
 * @author TZX
 *
 */
public interface ArrearageMapper {
	public List<Arrearage> queryReceipt(Condition c);
	public List<Arrearage> queryReceiptDetail(Condition c);
	public List<Arrearage> queryPay(Condition c);
	public List<Arrearage> queryPayDetail(Condition c);
	
}
