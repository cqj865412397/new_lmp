package com.lmq.service;

import java.util.List;
import com.lmq.domain.Storetype;

public interface Storetypeservice {

	List<Storetype> Storetype(Integer User1);
	
	List<Storetype> queryBylevel(Storetype obj);
}
