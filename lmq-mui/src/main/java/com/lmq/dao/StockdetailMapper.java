package com.lmq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lmq.domain.Stockdetail;

public interface StockdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stockdetail record);

    int insertSelective(Stockdetail record);

    Stockdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stockdetail record);

    int updateByPrimaryKey(Stockdetail record);
    //sid为门店编号 gid为商品实列编号
    List<Stockdetail> queryByGidAndSid(@Param("gid") Integer gid,@Param("sid") Integer sid);
    int updateBatch(List<Stockdetail> list);
    int updateScountById(@Param("id") Integer id,@Param("count") Integer count);
    
    int adds(Map<String, Object> map);

}