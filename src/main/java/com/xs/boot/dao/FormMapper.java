package com.xs.boot.dao;

import com.xs.boot.entity.Form;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by DELL on 2020/6/25.
 */
@Mapper
public interface FormMapper {
    public List<Form> getZJlist(Form form);
    public List<Form> getExam();
    public List<Form> getCourselist(Form form);
    public List<Form> getSchool();
    public List<Form> getFenjuan(Form form);

    public List<Form> getTime(Form form);
}
