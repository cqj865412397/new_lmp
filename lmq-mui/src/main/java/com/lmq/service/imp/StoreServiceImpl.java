package com.lmq.service.imp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.StoreMapper;
import com.lmq.dao.UserMapper;
import com.lmq.domain.Store;
import com.lmq.domain.User;
import com.lmq.service.StoreService;
@Service
@Transactional
public class StoreServiceImpl implements StoreService{
	@Autowired
	StoreMapper mapper;
	
	@Autowired
	UserMapper usermapper;
	@Override
	public List<Store> queryByUserId(Integer id) {
		// TODO Auto-generated method stub
		return mapper.queryByUserId(id);
	}
	@Override
	public List<Store> CurrentStore(Integer id) {
		// TODO Auto-generated method stub
		return mapper.CurrentStore(id);
	}
	@Override
	public int insertSelective(Store obj) {
		// TODO Auto-generated method stub
		 int i=mapper.insertSelective(obj);	//新增门店
		 int id=obj.getId();		//门店ID
		 if(i>0) {
			 User s=new User();
			 s.setName(obj.getUser().getName());
			 s.setPwd(obj.getUser().getPwd());
			 s.setUser1(String.valueOf(id));
			 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			 s.setTime(df.format(new Date()));
			 System.out.println(s);
			 return usermapper.insertSelective(s);
		 }
		 return 0;
	}
	@Override
	public Integer isAddEdit(Integer sId) {
		return mapper.isAddEdit(sId);
	}
	

}
