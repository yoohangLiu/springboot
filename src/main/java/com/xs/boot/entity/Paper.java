package com.xs.boot.entity;

/**
 * Created by asus on 2020/6/25.
 */
public class Paper {
    private int type_name;
    private int kc_code;
    private int course_id;
    private int stu_num;
    private int paper_num;
    private String kd_name;

    public int getPaper_num() {
        return paper_num;
    }

    public void setPaper_num(int paper_num) {
        this.paper_num = paper_num;
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

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getStu_num() {
        return stu_num;
    }

    public void setStu_num(int stu_num) {
        this.stu_num = stu_num;
    }

    public String getKd_name() {
        return kd_name;
    }

    public void setKd_name(String kd_name) {
        this.kd_name = kd_name;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "type_name=" + type_name +
                ", kc_code=" + kc_code +
                ", course_id=" + course_id +
                ", stu_num=" + stu_num +
                ", paper_num=" + paper_num +
                ", kd_name='" + kd_name + '\'' +
                '}';
    }
}
