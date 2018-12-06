package com.lmq.dao.report;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.report.Arrearage;
/**
 * 应收/付欠款
 * @author TZX
 *
 */
public interface ArrearageMapper {
	public List<Arrearage> queryReceipt(@Param("starttime")String starttime,@Param("endtime")String endtime);
	public List<Arrearage> queryReceiptDetail(@Param("cid")Integer cid,@Param("starttime")String starttime,@Param("endtime")String endtime);
	public List<Arrearage> queryPay(@Param("starttime")String starttime,@Param("endtime")String endtime);
	public List<Arrearage> queryPayDetail(@Param("sid")Integer sid,@Param("starttime")String starttime,@Param("endtime")String endtime);
	
}
