package com.xs.boot.service.impl.zkyx;

import com.xs.boot.dao.zkyx.OtherMapper;
import com.xs.boot.entity.zkyx.Other;
import com.xs.boot.service.zkyx.IOtherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class OtherServiceImpl implements IOtherService {
    @Resource
    private OtherMapper otherMapper;

    @Transactional
    @Override
    public void insert(Other other){
        otherMapper.insert(other);
    }


//    @Override
//    public void insertByMap(Map<String, String> map) {
//
//    }
}