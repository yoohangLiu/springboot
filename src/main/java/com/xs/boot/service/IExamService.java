package com.xs.boot.service;

import com.xs.boot.entity.Exam;

import java.util.List;

/**
 * Created by FF on 2020/6/16.
 */

public interface IExamService {
    public void insert(Exam exam);
    public Exam find_max(Exam exam); //查找已用最大考次
    public Exam findExam(Exam exam);
    public List<Exam> allExam(); //查找某一类型全部考试
}
