package com.xs.boot.dao.zkyx;

import com.xs.boot.entity.zkyx.ExamPoint;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExamPointMapper {

    public void insert(ExamPoint examPoint);
    public int count(ExamPoint examPoint);
    public void delete(ExamPoint examPoint);
    public int count_cap(ExamPoint examPoint);
    public List<ExamPoint> get_list(ExamPoint examPoint);
}
