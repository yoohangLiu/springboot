package com.xs.boot.service.impl;

import com.xs.boot.dao.StatMapper;
import com.xs.boot.entity.Paper;
import com.xs.boot.entity.Sche;
import com.xs.boot.service.IStatService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StatServiceImpl implements IStatService {
    @Resource
    private StatMapper statMapper;

    @Transactional
    @Override
    public List<Paper> paper_query(Paper paper){
        return statMapper.paper_query(paper);
    }

    @Transactional
    @Override
    public List<Sche> sche_query(Sche sche)
    {
        return statMapper.sche_query(sche);
    }

    @Transactional
    @Override
    public List<Paper> kd_paper_query(Paper paper){
        return statMapper.kd_paper_query(paper);
    }
}