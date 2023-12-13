package com.fs.service;

import java.util.List;

import com.fs.model.StorageVO;

public interface StorageService {
	
	public List<StorageVO> getAllStorage();
	
	public void insertStorage(StorageVO storageVO);
}