package com.lmq.service.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.CustomerMapper;
import com.lmq.dao.SalesMapper;
import com.lmq.dao.SalesdetailsMapper;
import com.lmq.dao.SalesindentMapper;
import com.lmq.dao.SalesstockinfoMapper;
import com.lmq.dao.StockMapper;
import com.lmq.dao.StockdetailMapper;
import com.lmq.domain.Customer;
import com.lmq.domain.Sales;
import com.lmq.domain.Salesdetails;
import com.lmq.domain.Salesindent;
import com.lmq.domain.Salesstockinfo;
import com.lmq.domain.Stockdetail;
import com.lmq.service.SalesService;

@Service
@Transactional
public class SalesServiceImpl implements SalesService {
	@Autowired
	SalesMapper sm;
	@Autowired
	SalesdetailsMapper ssm;
	@Autowired
	StockdetailMapper sdm;
	@Autowired
	SalesstockinfoMapper skm;
	@Autowired
	SalesindentMapper sidm;
	@Autowired
	CustomerMapper cm;

	@Override
	public int insertSelective(Sales record) {
		// TODO Auto-generated method stub
		sm.insertSelective(record);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("salesid", record.getId());
		List<Salesdetails> slist = record.getSalesdetails();
		map.put("slist", slist);
		// 增加销售详情数据
		ssm.adds(map);
		// 循环详情表
		for (Salesdetails sd : ssm.queryBySalesid(record.getId())) {
			// 通过商品编号和门店编号查询到还有剩余的库存详情表集合
			List<Stockdetail> sdlist = sdm.queryByGidAndSid(Integer.parseInt(sd.getUser1()), record.getSid());
			// List<Stockdetail> sdlist = sdm.queryByGidAndSid(1, 1);

			// 判断是否还有有库存的商品
			if (sdlist.size() > 0) {
				// 创建一个销售库存记录表集合
				List<Salesstockinfo> ssilist = new ArrayList<Salesstockinfo>();
				// 将表的出货数量丢入递归
				countCode(sdlist, ssilist, 0, sd.getCount());
				Map<String, Object> ssmap = new HashMap<String, Object>();
				ssmap.put("salesid", sd.getId());
				ssmap.put("ssilist", ssilist);
				// 批量新增库存销售详情表
				skm.adds(ssmap);
				// 批量修改库存详情表
				sdm.updateBatch(sdlist);
			}
		}
		if (record.getId() != -1) {
			// 成功了修改订单表的状态
			System.out.println(sidm.updateStatusById(record.getSiId(), 2));
			double balance = Double.parseDouble(record.getTakeinmoney()) - Double.parseDouble(record.getUser5());
			if (balance != 0) {
				Customer c = new Customer();
				c.setId(record.getCid());
				c.setBalance(balance);
				System.out.println("这是实际支付金额" + c.getBalance());
				cm.updateBalanceById(c);
			}
		}
		return 0;
	}

	@Override
	public String getTimeNum(Integer uid) {
		// TODO Auto-generated method stub
		return sm.getTimeNum(uid);
	}

	@Override
	public Sales queryById(Integer id) {
		// TODO Auto-generated method stub
		return sm.queryById(id);
	}

	@Override
	public List<Sales> queryList(String startTime, String endTime, String filtrate,Integer sid) {
		// TODO Auto-generated method stub
		System.out.println(filtrate);
		List<Salesindent> list = null;
		if (filtrate.equals("null")) {
			System.out.println("你好我是杨菊花");
			filtrate = "";
		}
		return sm.queryList(startTime, endTime, filtrate,sid);
	}

	/**
	 * 
	 * @param sd      库存详细集合
	 * @param ssilist 销售库存记录集合
	 * @param index   循环的库存单的下标
	 * @param count   总出货数
	 * @return 结束时的库存单下标
	 */
	public int countCode(List<Stockdetail> sd, List<Salesstockinfo> ssilist, int index, int count) {
		// 计算库存详情表该单品剩余库存
		int num = sd.get(index).getCount() - sd.get(index).getScount();
		Salesstockinfo s = new Salesstockinfo();
		s.setStatus(0);
		s.setStockdetailid(sd.get(index).getId());
		// 如果剩余库存大于本次提货数量
		if (num > count) {
			// 直接提货 修改出售数量
			sd.get(index).setScount(sd.get(index).getScount() + count);
			// 销售库存记录表记录出售数量
			s.setCount(count);
			ssilist.add(s);
			return index;
		} else {
			// 如果当前库存详情表低于提货数量
			// 记录本次提货数量
			s.setCount(num);
			ssilist.add(s);
			// 将本次库存信息表的出售数量拉满
			sd.get(index).setScount(sd.get(index).getCount());
			// 继续循环
			return countCode(sd, ssilist, index + 1, count - num);
		}
	}

	@Override
	public int updateStatusById(Integer id, Integer status) {
		// TODO Auto-generated method stub
		// 第一步先通过id获取到对象
		Sales s = sm.queryById(id);
		// 第二步,通过获取的对象找到订单编号,得到订单对象；
		String SalesIndentNub = s.getUser2();
		Salesindent si = sidm.queryBySalesIndentNub(SalesIndentNub);
		// 第三步，判断是否存在定金，如果有定金就返退
		/*
		 * if(si.getDeposi()!=null) { Customer c=new Customer();
		 * c.setId(Integer.parseInt(si.getCid())); c.setBalance(-si.getDeposi());
		 * cm.updateBalanceById(c); }
		 */
		// 第四步，完成之后将订单状态修改为未完成
		sidm.updateStatusById(si.getId(), 0);
		// 已经完成的订单和定金的回档，开始回档销售单的内容，销售单需要回档的内容有:
		// 销售单的状态改为1，销售单的结算金额需要回退客户，销售的商品需要对应的回到库存详情表中，销售库存详情表也要修改为1号状态
		// 销售详情单也要修改为状态1
		// 第五步，我们就先开始回档销售详情的状态把 因为销售详情中有销售编号 所有只要通过销售编号就能统一修改销售详情的状态
		ssm.updateStatusBySalesid(id);
		// 第六步，既然我们修改了详情表的状态，那么我们就开始回档商品把，先通过找到的销售对象里的销售详情集合
		// 通过销售详情的编号找到对应的销售库存详情表然后修改销售详情表的状态为1 ，在通过销售详情表的库存详情表编号属性找到对应的库存详情信息
		// 然后将提货的数量从库存详情的scount中减去
		List<Salesdetails> salesdetails = s.getSalesdetails();
		salesdetails.size();
		for (Salesdetails sd : salesdetails) {
			System.out.println(sd.getId());
			// 先通过销售详情编号修改库存销售状态
			skm.updateStatusBySalesid(sd.getId(), 1);
			// 先通过销售详情id找到库存销售的一个集合
			List<Salesstockinfo> salesstockinfo = skm.queryBySalesid(sd.getId());
			System.out.println(salesstockinfo.size());
			for (Salesstockinfo stinfo : salesstockinfo) {
				// 然后通过库存销售中的库存详情编号找到库存详情表把提货数量返回
				sdm.updateScountById(stinfo.getStockdetailid(), stinfo.getCount());
			}
		}
		if (id != -1) {
			// 第七步，我们已经完成了回档商品的操作,现在进行修改销售单状态的操作
			sm.updateStatusById(id, status);
			// 第八步,完成了上述操作之后 将金额反退给客户，这里应该判断 用户是赊账还是结账 不过我们有Takeinmoney实收属性在 可以解决用户是否收款的问题把
			// 这里我在生成销售单的时候将status做了处理,2是赊账，3是收款 收款的金额不算在账户余额上 所以这里只要判断状态是否为2 如果是 就进行退款操作
			double balance = Double.parseDouble(s.getTakeinmoney()) - Double.parseDouble(s.getUser5());
			Customer c = new Customer();
			c.setId(s.getCid());
			c.setBalance(-balance);
			cm.updateBalanceById(c);
		}
		return 0;
	}
}
