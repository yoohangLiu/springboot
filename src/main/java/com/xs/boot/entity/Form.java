package com.xs.boot.entity;

import java.util.Date;

/**
 * Created by DELL on 2020/6/24.
 */
public class Form {
    private int kc_code;
    private int type_name;
    private int course_id;
    private String name;
    private int sum;
    private int juandai_spec;
    public int getJuandai_spec() {
        return juandai_spec;
    }
    public void setJuandai_spec(int juandai_spec) {
        this.juandai_spec = juandai_spec;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
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

    public int getType_name() {
        return type_name;
    }

    public void setType_name(int type_name) {
        this.type_name = type_name;
    }

    public int getKc_code() {
        return kc_code;
    }

    public void setKc_code(int kc_code) {
        this.kc_code = kc_code;
    }


    public int getSum_kqu() {
        return sum_kqu;
    }

    public void setSum_kqu(int sum_kqu) {
        this.sum_kqu = sum_kqu;
    }

    //课程合订册
    private int sum_kqu;


    //院校合订册
    private int kd_id;
    private String kd_name;

    public int getKd_id() {
        return kd_id;
    }

    public void setKd_id(int kd_id) {
        this.kd_id = kd_id;
    }

    public String getKd_name() {
        return kd_name;
    }

    public void setKd_name(String kd_name) {
        this.kd_name = kd_name;
    }

    //分卷
    private String kqu_name;

    public int getSum_fenjuan() {
        return sum_fenjuan;
    }

    public void setSum_fenjuan(int sum_fenjuan) {
        this.sum_fenjuan = sum_fenjuan;
    }

    public String getKqu_name() {
        return kqu_name;
    }

    public void setKqu_name(String kqu_name) {
        this.kqu_name = kqu_name;
    }

    private int sum_fenjuan;

    //考试日程

    private Date start_time;
    private Date end_time;

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }
}
