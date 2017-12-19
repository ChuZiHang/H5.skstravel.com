package com.skstravel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skstravel.common.mapper.sksports2.MatcheMapper;
import com.skstravel.pojo.MatcheInfo;
import com.skstravel.service.MatcheService;
@Service
public class MatcheServiceImpl implements MatcheService {

	
	@Autowired
	private MatcheMapper matcheDao;
	
	public List<MatcheInfo> findAll() {
		return matcheDao.findAll();
	}
	
	
	

}
