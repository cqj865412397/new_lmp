package com.lmq.dao.report;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.report.Account;
import com.lmq.domain.report.Condition;
/**
 * 对账
 * @author TZX
 *
 */
public interface AccountMapper {
	List<Account> queryReceipt(Condition c);	//customer(顾客id),date
	List<Account> queryPay(Condition c);	//supplier(供应商id),date
}
