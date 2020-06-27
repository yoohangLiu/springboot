package com.xs.boot.entity;

public class Certain_exam_examArea {
    private int kc_code;
    private int type_name ;
    private String kqu_id ;
    private int kqu_capacity;
    private int xunkao_num;
    private String city_code;
    private String district_code;
    private int bk_student_num;
    public int getBk_student_num() {
        return bk_student_num;
    }

    public void setBk_student_num(int bk_student_num) {
        this.bk_student_num = bk_student_num;
    }


    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getDistrict_code() {
        return district_code;
    }

    public void setDistrict_code(String district_code) {
        this.district_code = district_code;
    }

    public Certain_exam_examArea() {
    }

    public int getKc_code() {
        return kc_code;
    }

    public void setKc_code(int kc_code) {
        this.kc_code = kc_code;
    }

    public int getType_name() {
        return type_name;
    }

    public void setType_name(int type_name) {
        this.type_name = type_name;
    }

    public String getKqu_id() {
        return kqu_id;
    }

    public void setKqu_id(String kqu_id) {
        this.kqu_id = kqu_id;
    }

    public int getKqu_capacity() {
        return kqu_capacity;
    }

    public void setKqu_capacity(int kqu_capacity) {
        this.kqu_capacity = kqu_capacity;
    }

    public int getXunkao_num() {
        return xunkao_num;
    }

    public void setXunkao_num(int xunkao_num) {
        this.xunkao_num = xunkao_num;
    }
}
