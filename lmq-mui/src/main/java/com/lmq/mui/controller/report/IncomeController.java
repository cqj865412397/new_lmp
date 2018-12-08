package com.lmq.mui.controller.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.domain.report.AllIncome;
import com.lmq.domain.report.Income;
import com.lmq.service.report.IncomeService;

@RestController
@RequestMapping("/income")
public class IncomeController {
	@Autowired
	IncomeService is;
	@RequestMapping("/queryAll")
	public AllIncome queryAll(){
		return is.queryAll();
	}
	@RequestMapping("/queryXS")
	public List<Income> queryXS(){
		return is.queryXS();
	}
	@RequestMapping("/querySK")
	public List<Income> querySK(){
		return is.querySK();
	}
	@RequestMapping("/queryJH")
	public List<Income> queryJH(){
		return is.queryJH();
	}
	@RequestMapping("/queryFK")
	public List<Income> queryFK(){
		return is.queryFK();
	}
	
}
