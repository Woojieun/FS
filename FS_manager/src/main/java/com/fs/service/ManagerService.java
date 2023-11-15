package com.fs.service;

import com.fs.model.ManagerVO;

public interface ManagerService {
	
	//로그인
	public ManagerVO managerLogin (ManagerVO manager) throws Exception;

}
