package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Supplier;
import com.lmq.domain.SupplierClassify;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer id);
    
    /**
     * 根据供应商ID修改供应商
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
    
    
    List<SupplierClassify> queryByIdAllSupplier(Integer sid);
}