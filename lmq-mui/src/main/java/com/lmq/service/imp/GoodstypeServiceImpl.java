package com.lmq.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmq.dao.GoodsMapper;
import com.lmq.dao.GoodstypeMapper;
import com.lmq.dao.StandardMapper;
import com.lmq.dao.StandardinstanceMapper;
import com.lmq.domain.Goodstype;
import com.lmq.domain.Standard;
import com.lmq.domain.StandardVO;
import com.lmq.domain.Standardinstance;
import com.lmq.service.GoodstypeService;
@Transactional
@Service
public class GoodstypeServiceImpl implements GoodstypeService{
	
	//==============注入==================
		@Autowired 
		GoodstypeMapper goodstypeMapper;
		@Autowired
		StandardMapper standardMapper;
		@Autowired
		StandardinstanceMapper standardinstanceMapper;
	//==============注入==================
	
	public List<Goodstype> queryTypeByParentId(Integer parentId) {
		return goodstypeMapper.queryTypeByParentId(parentId);
	}

	public List<Goodstype> queryAllParentIdByTid(Integer tId) {
		return goodstypeMapper.queryAllParentIdByTid(tId);
	}

	@Override
	public List<Goodstype> queryGoodstypeTop() {
		return goodstypeMapper.queryGoodstypeTop();
	}

	@Override
	public Integer addStype(StandardVO standardVO) {
		//取值
		List<Standard> oldStandard = standardVO.getOldStandard();//修改修改之前
		List<Standard> newStandard = standardVO.getNewStandard();//修改之后
		//新增类目
		Goodstype g = new Goodstype();
		g.setName(standardVO.getStypeName());
		g.setParentid(standardVO.gettId());
		if(goodstypeMapper.insert(g)<=0)
			return 0;
		
		for(int i = 0;i<newStandard.size();i++) {
			Standard s = newStandard.get(i);
			if(s.getId() == null) {
				//新增规格以及下面的规格值
				s.setTid(standardVO.gettId());
				s.setGid(-1);
				if(standardMapper.insert(s)<=0)
					return 0;
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("sId", s.getId());
				map.put("standardList", s.getsInList());
				if(standardinstanceMapper.addStandardInByMap(map)<=0)
					return 0;
			}else {//修改
				for(int j=0;j<oldStandard.size();j++) {
					if(newStandard.get(i).getId() == oldStandard.get(j).getId()) {//修改
						//规格下规格值是否发生改变
						//名称是否发生变化
						if(!newStandard.get(i).getName().equals(oldStandard.get(j).getName())){
							//改变规格名称
							if(standardMapper.updateByPrimaryKeySelective(newStandard.get(i))<=0)
								return 0;
						}
						for(int a = 0;a<newStandard.get(i).getsInList().size();a++) {
							//新增规格值
							if(newStandard.get(i).getsInList().get(a).getId() == null) {
								Standardinstance t = newStandard.get(i).getsInList().get(a);
								t.setSid(newStandard.get(i).getId());
								t.setGid(-1);
								if(standardinstanceMapper.insert(t)<=0)
									return 0 ;
								continue;
							}
							for(int b = 0; b<oldStandard.get(j).getsInList().size();b++) {
								//修改规格值名称
								if(newStandard.get(i).getsInList().get(a).getId() == oldStandard.get(j).getsInList().get(b).getId()) {
									if(newStandard.get(i).getsInList().get(a).getName().equals(oldStandard.get(j).getsInList().get(b).getName()))
										if(standardinstanceMapper.updateByPrimaryKeySelective(newStandard.get(i).getsInList().get(a))<=0)
											return 0;
									break;
								}
							}
						}
						//修改规格名称(更新)
						break;
					}
				}
			}
			//删除规格和删除规格值
			if(standardVO.getDeleteStandardId().length>0) {
				if(standardMapper.updateStandardStatus(standardVO.getDeleteStandardId())<=0)
					return 0;
				else {
					for(int h=0;h<standardVO.getDeleteStandardId().length;h++) {
						if(standardinstanceMapper.updateStandardardStatusBySid(standardVO.getDeleteStandardId()[h])<=0)
							return 0;
					}
				}
			}
			if(standardVO.getDeleteStandardInId().length>0) {
				if(standardinstanceMapper.updateStandardardStatus(standardVO.getDeleteStandardInId())<0)
					return 0;
			}
			
			
		}
		return 1;
	}

}
