package com.fs.mapper;

import java.util.List;

import com.fs.model.StorageVO;

public interface StorageMapper {
	
	public List<StorageVO> getAllStorage();
	
	public void insertStorage(StorageVO storageVO);
}