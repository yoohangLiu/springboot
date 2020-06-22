package com.xs.boot.dao;


import com.xs.boot.entity.Exam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by FF on 2020/6/16.
 */
@Mapper
public interface ExamMapper {
    public void insert(Exam exam);
    public Exam find_max(Exam exam); //查找已用最大考次
    public Exam findExam(Exam exam);
    public List<Exam> allExam();
}
