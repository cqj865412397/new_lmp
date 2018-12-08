package com.lmq.service.report;

import java.util.List;

import com.lmq.domain.report.Account;
import com.lmq.domain.report.Condition;

public interface AccountService {
	List<Account> queryReceipt(Condition c);
	List<Account> queryPay(Condition c);
}
