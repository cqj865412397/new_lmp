package com.lmq.dao;

import com.lmq.domain.Roleuser;

public interface RoleuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roleuser record);

    int insertSelective(Roleuser record);

    Roleuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Roleuser record);

    int updateByPrimaryKey(Roleuser record);
}