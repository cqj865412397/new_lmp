package com.lmq.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmq.dao.BitMapper;
import com.lmq.domain.Bit;
import com.lmq.service.BitService;
@Service
public class BitServiceImpl implements BitService{

	@Autowired
	BitMapper bitMapper;
	public List<Bit> queryBitBySid(Integer Sid) {
		return bitMapper.queryBitBySid(Sid);
	}

}
