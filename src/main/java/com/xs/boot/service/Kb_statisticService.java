package com.xs.boot.service;

import com.xs.boot.entity.Kb_statistic;

import java.util.List;

public interface Kb_statisticService {
    public List<Kb_statistic> getList_1(Kb_statistic kb_statistic);
    public List<Kb_statistic> getList_2(Kb_statistic kb_statistic);
    public List<Kb_statistic> getExam();
    public List<Kb_statistic> getFenjuan1(Kb_statistic kb_statistic);
    public List<Kb_statistic> getFenjuan2(Kb_statistic kb_statistic);
    public List<Kb_statistic> getJDlist1(Kb_statistic kb_statistic);
    public List<Kb_statistic> getJDlist2(Kb_statistic kb_statistic);
    public List<Kb_statistic> getBClist1(Kb_statistic kb_statistic);
    public List<Kb_statistic> getBClist2(Kb_statistic kb_statistic);
}
