package com.fs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.mapper.StorageMapper;
import com.fs.model.StorageVO;

@Service
public class StorageServicelmp implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public List<StorageVO> getAllStorage() {
        return storageMapper.getAllStorage();
    }
    
    @Override
    public void insertStorage(StorageVO storageVO) {
        // 데이터베이스 작업을 수행하는 MyBatis 매퍼가 있다고 가정합니다.
        storageMapper.insertStorage(storageVO);
    }
}