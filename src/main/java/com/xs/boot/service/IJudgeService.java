package com.xs.boot.service;

import com.xs.boot.entity.Judge;

import java.util.List;

/**
 * Created by DELL on 2020/6/23.
 */
public interface IJudgeService {
    public List<Judge> getjudgeList();
    public List<Judge> getschoolList();
    public void addJudge(Judge judge);
}
