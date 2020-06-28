package com.xs.boot.service.impl;

import com.xs.boot.dao.FormMapper;
import com.xs.boot.entity.Form;
import com.xs.boot.service.IFormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by DELL on 2020/6/25.
 */
@Service
public class FormServiceImpl implements IFormService {


    @Resource
    private FormMapper formMapper;

    @Override
    public List<Form> getZJlist(Form form){
        return formMapper.getZJlist(form);
    }

    @Override
    public List<Form> getExam(){
        return formMapper.getExam();
    }
     @Override
    public List<Form> getCourselist(Form form)
    {
        return formMapper.getCourselist(form);
    }

    @Override
    public List<Form> getSchool(){
        return formMapper.getSchool();
    }

    @Override
    public List<Form> getFenjuan(Form form){
        return formMapper.getFenjuan(form);
    }

    @Override
    public List<Form> getTime(Form form){
        return formMapper.getTime(form);
    }
}
