package com.lmq.dao;

import com.lmq.domain.Userstyle;

public interface UserstyleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userstyle record);

    int insertSelective(Userstyle record);

    Userstyle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userstyle record);

    int updateByPrimaryKey(Userstyle record);
}