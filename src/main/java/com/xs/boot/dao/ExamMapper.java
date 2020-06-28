package com.xs.boot.dao;


import com.xs.boot.entity.Blacklist;
import com.xs.boot.entity.Certain_exam_examArea;
import com.xs.boot.entity.Exam;
import com.xs.boot.entity.Kd_info;
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
    public void setExamTime(Exam exam);
    public void extExamTime(Exam exam);
    public void setSkBcTime(Exam exam);
    public Certain_exam_examArea findExam_Kq(Certain_exam_examArea cee);
    public void setSkXunkao(Certain_exam_examArea cee);
    List<Kd_info> allEnKd();
    void addEnKd(Kd_info kd);
    void deleteEnKd(Kd_info kd);
    List<Blacklist> allBL();
    void addBL(Blacklist bl);
    void deleteBL(Blacklist bl);
    public void setArrangetime(Exam exam);
    public void setJuandaispec(Exam exam);
    public void setZkaoTime(Exam exam);
    public List<Exam> getArrangetime();
    public List<Exam> getJuandaispec();
    public List<Exam> getZkaoTime();
    public List<Exam> getKqu(Exam exam);
    public void addKquNum(Exam exam);
    public List<Exam> getExam1();
}
