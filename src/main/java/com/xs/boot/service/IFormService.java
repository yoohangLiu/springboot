package com.xs.boot.service;

import com.xs.boot.entity.Form;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 2020/6/25.
 */
@Service
public interface IFormService {
    public List<Form> getZJlist(Form form);
    public List<Form> getExam();
    public List<Form> getCourselist(Form form);
    public List<Form> getSchool();
    public List<Form> getFenjuan(Form form);
    public List<Form> getTime(Form form);
}
