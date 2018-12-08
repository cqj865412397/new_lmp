package com.lmq.dao.report;

import java.util.List;

import com.lmq.domain.report.AllIncome;
import com.lmq.domain.report.Income;

public interface IncomeMapper {
	/**
	 * 查询收支总计
	 * @return
	 */
	public AllIncome queryAll();
	/**
	 * 销售
	 * @return
	 */
	public List<Income> queryXS();
	/**
	 * 收款
	 * @return
	 */
	public List<Income> querySK();
	/**
	 * 进货
	 * @return
	 */
	public List<Income> queryJH();
	/**
	 * 付款
	 * @return
	 */
	public List<Income> queryFK();
}
