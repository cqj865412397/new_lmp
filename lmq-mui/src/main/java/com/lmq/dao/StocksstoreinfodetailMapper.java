package com.lmq.dao;

import com.lmq.domain.Stocksstoreinfodetail;

public interface StocksstoreinfodetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stocksstoreinfodetail record);

    int insertSelective(Stocksstoreinfodetail record);

    Stocksstoreinfodetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stocksstoreinfodetail record);

    int updateByPrimaryKey(Stocksstoreinfodetail record);
}