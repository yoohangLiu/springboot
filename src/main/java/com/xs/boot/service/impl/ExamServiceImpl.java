package com.xs.boot.service.impl;

import com.xs.boot.dao.ExamMapper;
import com.xs.boot.entity.Exam;
import com.xs.boot.service.IExamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by FF on 2020/6/16.
 */
@Service
public class ExamServiceImpl implements IExamService{
    @Resource
    private ExamMapper examMapper;

    @Transactional
    @Override
    public void insert(Exam exam) {
        examMapper.insert(exam);
    }

    @Override
    public Exam findExam(Exam exam) {
        Exam examNew = examMapper.findExam(exam);
        return examNew;
    }
}
