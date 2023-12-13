package com.fs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.mapper.DeliveryMapper;
import com.fs.model.DeliveryVO;

@Service
public class DeliveryServicelmp implements DeliveryService {

    @Autowired
    private DeliveryMapper deliveryMapper;

    @Override
    public List<DeliveryVO> getAllDelivery() {
        return deliveryMapper.getAllDelivery();
    }
}