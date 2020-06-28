package com.xs.boot.service.impl.zkyx;


import com.xs.boot.dao.zkyx.skVioMapper;
import com.xs.boot.entity.zkyx.skVio;
import com.xs.boot.entity.zkyx.skViolist;
import com.xs.boot.service.zkyx.skIVioService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class skVioServiceImpl implements skIVioService {
    @Resource
    private skVioMapper skVioMapper;

    @Override
    public List<skVio> findAll(){
        List<skVio> vioList = skVioMapper.findAll();
        return vioList;
    }

    @Override
    public List<skViolist> findpostAll(){
        List<skViolist> postList = skVioMapper.findpostAll();
        return postList;
    }


    @Override
    @Transactional
    public void addPost(skViolist violist){
        skVioMapper.addPost(violist);
    };

    @Override
    public skViolist findPostNeed(){
        skViolist postneed = skVioMapper.findPostNeed();
        return postneed;
    }

    @Override
    @Transactional
    public void deleteVio(int violation_id){

    };

    @Override
    @Transactional
    public void modifyVio(int violation_id){

    };
}
