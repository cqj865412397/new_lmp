package com.lmq.dao;

import com.lmq.domain.Rolemodule;

public interface RolemoduleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rolemodule record);

    int insertSelective(Rolemodule record);

    Rolemodule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rolemodule record);

    int updateByPrimaryKey(Rolemodule record);
}