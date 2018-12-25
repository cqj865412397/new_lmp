package com.lmq.dao;

import java.util.List;

import com.lmq.domain.Customerlevel;

public interface CustomerlevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customerlevel record);

    int insertSelective(Customerlevel record);

    Customerlevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customerlevel record);

    int updateByPrimaryKey(Customerlevel record);
    
    List<Customerlevel> queryCustomerlevelBySid(Integer sid);
}