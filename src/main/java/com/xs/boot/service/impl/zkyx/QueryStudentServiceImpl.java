package com.xs.boot.service.impl.zkyx;

import com.xs.boot.dao.zkyx.StudentMapper;
import com.xs.boot.entity.zkyx.Student;
import com.xs.boot.service.zkyx.IQueryStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class QueryStudentServiceImpl implements IQueryStudentService {

    @Resource
    private StudentMapper studentMapper;

    @Transactional
    @Override
    public Student query(Student student) {
        return studentMapper.query_student(student);
    }

    @Transactional
    @Override
    public Student alter_county(Student student) {
        studentMapper.alter_county(student);
        return studentMapper.query_student(student);
    }
}
