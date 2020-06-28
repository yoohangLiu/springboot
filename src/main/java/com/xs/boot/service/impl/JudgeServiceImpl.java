package com.xs.boot.service.impl;

import com.xs.boot.dao.JudgeMapper;
import com.xs.boot.entity.Judge;
import com.xs.boot.service.IJudgeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by DELL on 2020/6/23.
 */
@Service
public class JudgeServiceImpl implements IJudgeService {
    @Resource
    private JudgeMapper judgeMapper;

    @Override
    public List<Judge> getjudgeList(){
        return judgeMapper.getjudgeList();
    }

    @Override
    public List<Judge> getschoolList(){
        return judgeMapper.getschoolList();
    }

    @Override
    @Transactional
    public void addJudge(Judge judge){
        judgeMapper.addJudge(judge);
    }

}
