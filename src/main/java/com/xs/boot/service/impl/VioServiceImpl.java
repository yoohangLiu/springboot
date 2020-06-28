package com.xs.boot.service.impl;

import com.xs.boot.dao.VioMapper;
import com.xs.boot.entity.Vio;
import com.xs.boot.entity.Violist;
import com.xs.boot.service.IVioService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by DELL on 2020/6/19.
 */
@Service
public class VioServiceImpl implements IVioService {
    @Resource
    private VioMapper vioMapper;

    @Override
    public List<Vio> findAll(){
        List<Vio> vioList = vioMapper.findAll();
        return vioList;
    }

    @Override
    public List<Violist> findpostAll(){
        List<Violist> postList = vioMapper.findpostAll();
        return postList;
    }


    @Override
    @Transactional
    public void addVio(Vio vio){
        vioMapper.addVio(vio);
    };

    @Override
    @Transactional
    public void deleteVio(int violation_id){

    };

    @Override
    @Transactional
    public void modifyVio(int violation_id){

    };
}
