package com.lmq.domain.report;

import java.util.Date;
import java.util.List;
/**
 * 利润明细
 * @author TZX
 *
 */
public class ProfitDetail {
	private Integer count;	//数量
	private Double paymoney;	//实际支付金额
	private Double money;	//原价
	private Double costmoney;	//成本
	private Double profit;	//利润
	private Double profitability;	//利润率
	private Date time;	//交易时间
	
	private Integer cid;	//客户id
	private String cname;	//客户姓名
	
	private Integer goodsinstanceid;	//商品实例id
	private String gname;	//商品名称
	private List<String> standardName;
}
