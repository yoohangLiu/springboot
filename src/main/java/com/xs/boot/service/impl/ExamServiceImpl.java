package com.xs.boot.service.impl;

import com.xs.boot.dao.ExamMapper;
import com.xs.boot.entity.Blacklist;
import com.xs.boot.entity.Certain_exam_examArea;
import com.xs.boot.entity.Exam;
import com.xs.boot.entity.Kd_info;
import com.xs.boot.service.IExamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FF on 2020/6/16.
 */
@Service
public class ExamServiceImpl implements IExamService {
    @Resource
    private ExamMapper examMapper;

    @Transactional
    @Override
    public void insert(Exam exam) {
        examMapper.insert(exam);
    }

    @Override
    public Exam find_max(Exam exam){
        return examMapper.find_max(exam);
    }

    @Override
    public Exam findExam(Exam exam) {
        return examMapper.findExam(exam);
    }

    @Override
    public List<Exam> allExam() {
        return examMapper.allExam();
    }

    @Override
    public void setExamTime(Exam exam){examMapper.setExamTime(exam);}

    @Override
    public void extExamTime(Exam exam){examMapper.extExamTime(exam);}

    @Override
    public void setSkBcTime(Exam exam){examMapper.setSkBcTime(exam);}

    @Override
    public Certain_exam_examArea findExam_Kq(Certain_exam_examArea cee) {
        return examMapper.findExam_Kq(cee);
    }

    @Override
    public void setSkXunkao(Certain_exam_examArea cee)
    {
        examMapper.setSkXunkao(cee);
    }
    @Override
    public List<Kd_info> allEnKd()
    {
        return examMapper.allEnKd();
    }

    @Override
    public void addEnKd(Kd_info kd)
    {
        examMapper.addEnKd(kd);
    }

    @Override
    public void deleteEnKd(Kd_info kd)
    {
        examMapper.deleteEnKd(kd);
    }

    @Override
    public List<Blacklist> allBL()
    {
        return examMapper.allBL();
    }

    @Override
    public void addBL(Blacklist kd)
    {
        examMapper.addBL(kd);
    }

    @Override
    public void deleteBL(Blacklist kd)
    {
        examMapper.deleteBL(kd);
    }

    @Override
    @Transactional
    public void setArrangetime(Exam exam){
        examMapper.setArrangetime(exam);
    }

    @Override
    @Transactional
    public void setJuandaispec(Exam exam)
    {
        examMapper.setJuandaispec(exam);
    }

    @Override
    @Transactional
    public void setZkaoTime(Exam exam)
    {
        examMapper.setZkaoTime(exam);
    }

    @Override
    public List<Exam> getArrangetime(){
        return examMapper.getArrangetime();
    }

    @Override
    public List<Exam> getJuandaispec(){
        return examMapper.getJuandaispec();
    }

    @Override
    public List<Exam> getZkaoTime(){
        return examMapper.getZkaoTime();
    }

    @Override
    public List<Exam> getKqu(Exam exam)
    {
        return examMapper.getKqu(exam);
    }

    @Override
    @Transactional
    public void addKquNum(Exam exam)
    {
        examMapper.addKquNum(exam);
    }

    @Override
    public List<Exam> getExam1(){
        return examMapper.getExam1();
    }
}
