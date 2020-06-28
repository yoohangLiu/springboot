package com.xs.boot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Kb_statistic {
    private int kc_code;
    private int type_name;
    private int kd_id;
    private int course_id;
    private int sum;
    private int sum_fenjuan;
    private int juandai_spec;
    private String city_code;
    private String district_code;
    private String name;
    private String kqu_name;
    private String kqu_id;
    private String kd_name;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT")
    private Date start_time;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT")
    private Date end_time;


    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setDistrict_code(String district_code) {
        this.district_code = district_code;
    }

    public String getDistrict_code() {
        return district_code;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setCourse_id(int course_id){ this.course_id=course_id; }
    public int getCourse_id(){return course_id;}
    public void setSum(int sum) { this.sum = sum; }
    public int getSum() { return sum; }
    public void setJuandai_spec(int juandai_spec) { this.juandai_spec = juandai_spec; }
    public int getJuandai_spec() { return juandai_spec; }
    public void setKc_code(int kc_code){ this.kc_code=kc_code; }
    public int getKc_code(){ return kc_code;}
    public void setType_name(int type_name){ this.type_name=type_name; }
    public int getType_name(){ return type_name; }
    public void setKd_id(int kd_id){ this.kd_id=kd_id ;}
    public int getKd_id(){ return kd_id;}
    public void setKd_name(String kd_name){ this.kd_name=kd_name;}
    public String getKd_name(){ return kd_name;}
    public void setStart_time(Date start_time){ this.start_time=start_time;}
    public Date getStart_time(){ return start_time;}
    public void setEnd_time(Date end_time){this.end_time=end_time; }
    public Date getEnd_time(){return end_time; }
    public void setKqu_id(String kqu_id){ this.kqu_id=kqu_id; }
    public String getKqu_id(){ return kqu_id;}

    public void setSum_fenjuan(int sum_fenjuan) {
        this.sum_fenjuan = sum_fenjuan;
    }

    public int getSum_fenjuan() {
        return sum_fenjuan;
    }

    public void setKqu_name(String kqu_name) {
        this.kqu_name = kqu_name;
    }

    public String getKqu_name() {
        return kqu_name;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", kd_id=" + kd_id +
                ".kd_name" + kd_name +
                ",start_time"+ start_time +
                ",end_time" + end_time +
                '}';
    }
}
