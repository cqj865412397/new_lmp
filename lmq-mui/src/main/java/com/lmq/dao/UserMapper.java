package com.lmq.dao;

import com.lmq.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User obj);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User queryuser(User obj);
    
    User queryuser1(User obj);
    
}