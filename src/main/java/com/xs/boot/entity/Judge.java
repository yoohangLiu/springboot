package com.xs.boot.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by DELL on 2020/6/23.
 */
public class Judge {
    private int kc_code;
    private int type_name;
    private int course_id;
    private String name;  //课程名称
    private int school_id;
    private String school_name;
    private List<Integer> school_id_list;
    private int major_id;
    private Date judge_begin;
    private Date judge_end;
    private String major_name;

    public String getMajor_name() {
        return major_name;
    }

    public void setMajor_name(String major_name) {
        this.major_name = major_name;
    }

    @Override
    public String toString() {
        return "Judge{" +
                "kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", course_id=" + course_id +
                ", name='" + name + '\'' +
                ", school_id=" + school_id +
                ", school_name='" + school_name + '\'' +
                ", school_id_list=" + school_id_list +
                ", major_id=" + major_id +
                ", judge_begin=" + judge_begin +
                ", judge_end=" + judge_end +
                ", judge_teacher_num=" + judge_teacher_num +
                '}';
    }

    public int getKc_code() {
        return kc_code;
    }

    public void setKc_code(int kc_code) {
        this.kc_code = kc_code;
    }

    public int getJudge_teacher_num() {

        return judge_teacher_num;
    }

    public void setJudge_teacher_num(int judge_teacher_num) {
        this.judge_teacher_num = judge_teacher_num;
    }

    public Date getJudge_end() {
        return judge_end;
    }

    public void setJudge_end(Date judge_end) {
        this.judge_end = judge_end;
    }

    public Date getJudge_begin() {
        return judge_begin;
    }

    public void setJudge_begin(Date judge_begin) {
        this.judge_begin = judge_begin;
    }

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }

    public List<Integer> getSchool_id_list() {
        return school_id_list;
    }

    public void setSchool_id_list(List<Integer> school_id_list) {
        this.school_id_list = school_id_list;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public int getType_name() {
        return type_name;
    }

    public void setType_name(int type_name) {
        this.type_name = type_name;
    }

    private int judge_teacher_num;

}
