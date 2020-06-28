package com.xs.boot.entity;

public class Kb_zkz {
    private int kc_code;
    private int type_name;
    private String exam_type_name;
    private int student_id;
    private int course_id;
    private String name;      //课程名
    private String zkao_num;
    private String stu_name;
    private String city_code;
    private String district_code;

    public void setExam_type_name(String exam_type_name) {
        this.exam_type_name = exam_type_name;
    }

    public String getExam_type_name() {
        return exam_type_name;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setKc_code(int kc_code) {
        this.kc_code = kc_code;
    }

    public int getKc_code() {
        return kc_code;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_name() {
        return stu_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setType_name(int type_name) {
        this.type_name = type_name;
    }

    public int getType_name() {
        return type_name;
    }

    public void setZkao_num(String zkao_num) {
        this.zkao_num = zkao_num;
    }

    public String getZkao_num() {
        return zkao_num;
    }

    @Override
    public String toString() {
        return "Kb_zkz{" +
                "kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", student_id=" + student_id +
                ", course_id=" + course_id +
                ", name='" + name + '\'' +
                ", zkao_num='" + zkao_num + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", city_code='" + city_code + '\'' +
                ", district_code='" + district_code + '\'' +
                '}';
    }
}
