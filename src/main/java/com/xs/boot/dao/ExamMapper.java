package com.xs.boot.dao;


import com.xs.boot.entity.Exam;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by FF on 2020/6/16.
 */
@Mapper
public interface ExamMapper {
    public void insert(Exam exam);
}
