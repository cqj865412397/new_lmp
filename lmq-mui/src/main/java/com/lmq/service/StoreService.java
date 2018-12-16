package com.lmq.service;

import java.util.List;

import com.lmq.domain.Store;

public interface StoreService {
	 List<Store> queryByUserId(Integer id);
}
