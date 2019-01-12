package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.report.Arrearage;
import com.lmq.domain.report.Condition;
import com.lmq.service.report.ArrearageService;
/**
 * 欠款
 * @author TZX
 *不记名散客-1不计入欠款对账单统计
 */
@RestController
public class ArrearageController {
	@Autowired
	ArrearageService as;
	//应收--客户
	@RequestMapping("/receiptArrearage")
	public List<Arrearage> receiptArrearage(Condition c) {
		System.out.println("应收欠款");
		return as.queryReceipt(c);
	}
	@RequestMapping("/receiptArrearage_Detail")
	public List<Arrearage> receiptArrearage_Detail(Condition c) {
		System.out.println("应收欠款-详情");
		return as.queryReceiptDetail(c);
	}
	
	//应付--供应商
	@RequestMapping("/paytArrearage")
	public List<Arrearage> paytArrearage(Condition c) {
		System.out.println("应付欠款");
		return as.queryPay(c);
	}
	@RequestMapping("/paytArrearage_Detail")
	public List<Arrearage> paytArrearage_Detail(Condition c) {
		System.out.println("应付欠款-详情");
		return as.queryPayDetail(c);
	}
}
