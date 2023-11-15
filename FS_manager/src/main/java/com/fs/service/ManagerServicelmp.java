package com.fs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.mapper.ManagerMapper;
import com.fs.model.ManagerVO;

@Service
public class ManagerServicelmp implements ManagerService {
	
	@Autowired
	ManagerMapper managermapper;
	
	//로그인
	@Override
	public ManagerVO managerLogin (ManagerVO manager) throws Exception {
		return managermapper.managerLogin(manager);
	}

}
