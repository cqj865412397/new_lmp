package com.lmq.dao;

import com.lmq.domain.Supplierlevel;

public interface SupplierlevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Supplierlevel record);

    int insertSelective(Supplierlevel record);

    Supplierlevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Supplierlevel record);

    int updateByPrimaryKey(Supplierlevel record);
}