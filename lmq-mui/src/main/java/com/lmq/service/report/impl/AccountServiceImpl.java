package com.lmq.service.report.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.report.AccountMapper;
import com.lmq.domain.report.Account;
import com.lmq.domain.report.Condition;
import com.lmq.service.report.AccountService;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountMapper am;
	@Override
	public List<Account> queryReceipt(Condition c) {
		// TODO Auto-generated method stub
		return am.queryReceipt(c);
	}

	@Override
	public List<Account> queryPay(Condition c) {
		// TODO Auto-generated method stub
		return am.queryPay(c);
	}

}
