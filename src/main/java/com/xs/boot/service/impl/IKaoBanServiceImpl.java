package com.xs.boot.service.impl;

import com.xs.boot.dao.KaoBanMapper;
import com.xs.boot.entity.Certain_kqu_kd;
import com.xs.boot.service.IKaoBanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class IKaoBanServiceImpl implements IKaoBanService {
    @Resource
    private KaoBanMapper kaoBanMapper;

    @Transactional
    @Override
    public List<Certain_kqu_kd> find_kqu_kd(Certain_kqu_kd certain_kqu_kd) {
        return kaoBanMapper.find_kqu_kd(certain_kqu_kd);
    }

    @Transactional
    @Override
    public void addKaoChangRongLiang( int num) {
        kaoBanMapper.insertKaoChangRongLiang(num);
    }

}
