package com.xs.boot.entity.zkyx;

public class RecordBk {
    private int student_id;
    private int kc_code;
    private int type_name;
    private int bk_major_id;
    private int bk_course_id;
    private String kqu_id;
    private int kd_id;

    public int getKd_id() {
        return kd_id;
    }

    public void setKd_id(int kd_id) {
        this.kd_id = kd_id;
    }


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
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

    public int getBk_major_id() {
        return bk_major_id;
    }

    public void setBk_major_id(int bk_major_id) {
        this.bk_major_id = bk_major_id;
    }

    public int getBk_course_id() {
        return bk_course_id;
    }

    public void setBk_course_id(int bk_course_id) {
        this.bk_course_id = bk_course_id;
    }

    public String getKqu_id() {
        return kqu_id;
    }

    public void setKqu_id(String kqu_id) {
        this.kqu_id = kqu_id;
    }
}
