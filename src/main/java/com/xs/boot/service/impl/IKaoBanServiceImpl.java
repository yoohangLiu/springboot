package com.xs.boot.service.impl;

import com.xs.boot.dao.KaoBanMapper;
import com.xs.boot.service.IKaoBanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class IKaoBanServiceImpl implements IKaoBanService {
    @Resource
    private KaoBanMapper kaoBanMapper;

    @Transactional
    @Override
    public void addKaoChangRongLiang( int num) {
        kaoBanMapper.insertKaoChangRongLiang(num);
    }

}
