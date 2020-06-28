package com.xs.boot.entity.kaosheng;

/**
 * Created by FF on 2020/6/23.
 */
public class StudentBkEntity {
    private int student_id;
    private int kc_code;
    private int type_name;
    private int bk_major;
    private int bk_course_id;
    private String kqu_id;
    private int target_school_id;
    private String op_time;
    private int pay_state;

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

    public int getBk_major() {
        return bk_major;
    }

    public void setBk_major(int bk_major) {
        this.bk_major = bk_major;
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

    public int getTarget_school_id() {
        return target_school_id;
    }

    public void setTarget_school_id(int target_school_id) {
        this.target_school_id = target_school_id;
    }

    public String getOp_time() {
        return op_time;
    }

    public void setOp_time(String op_time) {
        this.op_time = op_time;
    }

    public int getPay_state() {
        return pay_state;
    }

    public void setPay_state(int pay_state) {
        this.pay_state = pay_state;
    }

    @Override
    public String toString() {
        return "StudentBkEntity{" +
                "student_id=" + student_id +
                ", kc_code=" + kc_code +
                ", type_name='" + type_name + '\'' +
                ", bk_major='" + bk_major + '\'' +
                ", bk_course_id=" + bk_course_id +
                ", kqu_id=" + kqu_id +
                ", target_school_id=" + target_school_id +
                ", op_time='" + op_time + '\'' +
                ", pay_state=" + pay_state +
                '}';
    }
}