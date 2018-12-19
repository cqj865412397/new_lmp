package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.report.AllIncome;
import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Income;
import com.lmq.service.report.IncomeService;

@RestController
@RequestMapping("/income")
public class IncomeController {
	@Autowired
	IncomeService is;
	@RequestMapping("/queryAll")
	public AllIncome queryAll(Condition c){
		System.out.println("收支-所有");
		return is.queryAll(c);
	}
	@RequestMapping("/queryXS")
	public List<Income> queryXS(Condition c){
		System.out.println("收支-销售");
		return is.queryXS(c);
	}
	@RequestMapping("/querySK")
	public List<Income> querySK(Condition c){
		System.out.println("收支-收款/定金");
		return is.querySK(c);
	}
	@RequestMapping("/queryJH")
	public List<Income> queryJH(Condition c){
		System.out.println("收支-进货");
		return is.queryJH(c);
	}
	@RequestMapping("/queryFK")
	public List<Income> queryFK(Condition c){
		System.out.println("收支-付款");
		return is.queryFK(c);
	}
	@RequestMapping("/queryWY")
	public List<Income> queryWY(Condition c){
		System.out.println("收支-物业");
		return null;
	}
}
