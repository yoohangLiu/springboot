package com.xs.boot.service.impl;

import com.xs.boot.dao.Kb_statisticMapper;
import com.xs.boot.entity.Kb_statistic;
import com.xs.boot.service.Kb_statisticService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Kb_statisticServiceImpl implements Kb_statisticService {
    @Resource
    private Kb_statisticMapper kb_statisticMapper;

    @Override
    public List<Kb_statistic> getList_1(Kb_statistic kb_statistic){ return kb_statisticMapper.getList_1(kb_statistic);}
    public List<Kb_statistic> getList_2(Kb_statistic kb_statistic){ return kb_statisticMapper.getList_2(kb_statistic);}
    public List<Kb_statistic> getExam(){return kb_statisticMapper.getExam();}

    @Override
    public List<Kb_statistic> getJDlist1(Kb_statistic kb_statistic){
        return kb_statisticMapper.getJDlist1(kb_statistic);}
    public List<Kb_statistic> getJDlist2(Kb_statistic kb_statistic){
        return kb_statisticMapper.getJDlist2(kb_statistic);}

    @Override
    public List<Kb_statistic> getBClist1(Kb_statistic kb_statistic){
        return kb_statisticMapper.getBClist1(kb_statistic);}
    public List<Kb_statistic> getBClist2(Kb_statistic kb_statistic){
        return kb_statisticMapper.getBClist2(kb_statistic);}

    @Override
    public List<Kb_statistic> getFenjuan1(Kb_statistic kb_statistic){
        return kb_statisticMapper.getFenjuan1(kb_statistic);
    }
    public List<Kb_statistic> getFenjuan2(Kb_statistic kb_statistic){
        return kb_statisticMapper.getFenjuan2(kb_statistic);
    }

}
