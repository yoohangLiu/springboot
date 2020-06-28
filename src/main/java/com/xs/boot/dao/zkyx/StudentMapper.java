package com.xs.boot.dao.zkyx;

import com.xs.boot.entity.zkyx.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentMapper {
    public Student query_student(Student student);
    public void alter_county(Student student);
}
