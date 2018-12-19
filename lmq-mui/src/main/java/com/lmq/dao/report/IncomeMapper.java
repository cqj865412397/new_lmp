package com.lmq.dao.report;

import java.util.List;

import com.lmq.domain.report.AllIncome;
import com.lmq.domain.report.Condition;
import com.lmq.domain.report.Income;

public interface IncomeMapper {
	/**
	 * 查询收支总计
	 * @return
	 */
	public AllIncome queryAll(Condition c);
	/**
	 * 销售
	 * @return
	 */
	public List<Income> queryXS(Condition c);
	/**
	 * 收款
	 * @return
	 */
	public List<Income> querySK(Condition c);
	/**
	 * 进货
	 * @return
	 */
	public List<Income> queryJH(Condition c);
	/**
	 * 付款
	 * @return
	 */
	public List<Income> queryFK(Condition c);
}
