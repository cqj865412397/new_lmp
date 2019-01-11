package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.report.Account;
import com.lmq.domain.report.Condition;
import com.lmq.service.report.AccountService;
/**
 * 对账
 * @author TZX
 *不记名散客-1不计入欠款对账单统计
 */
@RestController
public class AccountController {
	@Autowired
	AccountService as;
	//应收--客户
	@RequestMapping("/receiptAccount")
	public List<Account> receiptAccount(Condition c) {
		System.out.println("应收对账");
		System.out.println("时间范围date:"+c.getDate()+"客户："+c.getCustomer()+"\n"+c.getStartdate()+"-"+c.getEnddate());
		List<Account> list=as.queryReceipt(c);
		return as.queryReceipt(c);
	}
	//应付-供应商
	@RequestMapping("/payAccount")
	public List<Account> payAccount(Condition c) {
		System.out.println("应付对账");
		c.setSupplier(1);
		System.out.println("时间范围date:"+c.getDate()+"供应商："+c.getSupplier()+"\n"+c.getStartdate()+"-"+c.getEnddate());
		return as.queryPay(c);
	}
}
