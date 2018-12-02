package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.report.Arrearage;
import com.lmq.service.report.ArrearageService;
/**
 * 欠款
 * @author TZX
 *
 */
@RestController
public class ArrearageController {
	@Autowired
	ArrearageService as;
	//应收--客户
	@RequestMapping("/receiptArrearage")
	public List<Arrearage> receiptArrearage(String starttime,String endtime) {
		System.out.println("应收欠款");
		return as.queryReceipt("2017-1-1", "2018-1-1");
	}
	@RequestMapping("/receiptArrearage_Detail")
	public List<Arrearage> receiptArrearage_Detail(Integer cid,String starttime,String endtime) {
		System.out.println("应收欠款");
		return as.queryReceiptDetail(cid,"2017-1-1", "2018-1-1");
	}
	
	//应付--供应商
	@RequestMapping("/paytArrearage")
	public List<Arrearage> paytArrearage(String starttime,String endtime) {
		System.out.println("应付欠款");
		return as.queryPay("2017-1-1", "2018-1-1");
	}
	@RequestMapping("/paytArrearage_Detail")
	public List<Arrearage> paytArrearage_Detail(Integer sid,String starttime,String endtime) {
		System.out.println("应付欠款");
		return as.queryPayDetail(sid,"2017-1-1", "2018-1-1");
	}
}
