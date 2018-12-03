package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.SupplierMapper;
import com.lmq.domain.Supplier;
import com.lmq.domain.SupplierClassify;
import com.lmq.service.SupplierService;
import com.lmq.utils.ChineseToEnglish;
@Service
@Transactional
public class SupplierServiceImpl implements SupplierService{
	@Autowired
	SupplierMapper mapper;
	@Autowired
	ChineseToEnglish chinese;

	@Override
	public List<SupplierClassify> queryByIdAllSupplier(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.queryByIdAllSupplier(sid);
	}
	
	//新增供应商
	@Override
	public int insertSelective(Supplier record) {
		String name=record.getName();
		record.setEnglishname(chinese.getPingYin(name));
		System.out.println(record.getEnglishname());
		record.setAcronymname(chinese.getPinYinHeadChar(name).substring(0, 1).toUpperCase());
		return mapper.insertSelective(record);
	}

	@Override
	public Supplier selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}
	//修改供应商
	@Override
	public int updateByPrimaryKeySelective(Supplier record) {
		String name=record.getName();
		record.setEnglishname(chinese.getPingYin(name));
		System.out.println(record.getEnglishname());
		record.setAcronymname(chinese.getPinYinHeadChar(name).substring(0, 1).toUpperCase());
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}
	

}
