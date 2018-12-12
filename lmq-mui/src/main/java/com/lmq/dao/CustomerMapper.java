package com.lmq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import com.lmq.domain.Classify;
import com.lmq.domain.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);
    
    /**
      * 根据客户ID查询
     * @param id
     * @return
     */
    Customer selectByPrimaryKey(Integer id);
    
    /**
     * 修改客户
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    
    
    
    /*<!-- 根据门店查询出客户消费的总金额和客户信息 -->*/
    List<Classify> queryGroupByAcronymname(Integer sid);
    
    
    
    int updateBalanceById(Customer record);
    
    Customer queryBalanceById(Integer id);
    
    String getTimeNum(Integer uid);
    //根据客户ID查询客户Pid(客户类型)
    int queryByIdResultPid(Integer id);
    
  //根据客户ID删除
    int deleteByCid(Integer id);

}