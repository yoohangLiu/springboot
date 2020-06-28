package com.xs.boot.entity.kaosheng;

import java.util.Date;

/**
 * Created by FF on 2020/6/26.
 */
// 呈现给前端的考试座位信息实体类
public class SeatDetailsEntity {
    // 查出来的字段
    // `student_id`, `bk_major`, `target_school_id`, `pay_state`,
    // `zkao_num`, `kc_code`, `type_name`, `kqu_id`, `kd_id`, `kaochang_id`, `kaotang_code`, `seat_num`,
    // `course_id`, `name`, `money`,
    // `kd_name`, `post_code`,
    // `thorough_address`,
    // `kqu_name`,
    // `dy_zw_s_time`, `dy_zw_e_time`, `exam_start_time`, `exam_end_time`,
    // `exam_type_name`)

    private int student_id;
    private int bk_major;// 映射回名字
    private int target_school_id;// 映射回名字
    private int pay_state;

    private String zkao_num;
    private int kc_code;
    private int type_name;
    private String kqu_id;
    private int kd_id;
    private int kaochang_id;
    private String kaotang_code;
    private int set_num;


    private int course_id;
    private String name;
    private double money;

    private String kd_name;
    private int post_code;

    private String thorough_address;

    private String kqu_name;

    private Date dy_zw_s_time;
    private Date dy_zw_e_time;
    private String exam_start_time;
    private String exam_end_time;

    private String exam_type_name;
    private String major_name;
    private String school_name;

    // 是否允许打印准考证
    private int dy_zw_allowed;

    @Override
    public String toString() {
        return "SeatDetailsEntity{" +
                "student_id=" + student_id +
                ", bk_major=" + bk_major +
                ", target_school_id=" + target_school_id +
                ", pay_state=" + pay_state +
                ", zkao_num='" + zkao_num + '\'' +
                ", kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", kqu_id='" + kqu_id + '\'' +
                ", kd_id=" + kd_id +
                ", kaochang_id=" + kaochang_id +
                ", kaotang_code='" + kaotang_code + '\'' +
                ", set_num=" + set_num +
                ", course_id=" + course_id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", kd_name='" + kd_name + '\'' +
                ", post_code=" + post_code +
                ", thorough_address='" + thorough_address + '\'' +
                ", kqu_name='" + kqu_name + '\'' +
                ", dy_zw_s_time=" + dy_zw_s_time +
                ", dy_zw_e_time=" + dy_zw_e_time +
                ", exam_start_time='" + exam_start_time + '\'' +
                ", exam_end_time='" + exam_end_time + '\'' +
                ", exam_type_name='" + exam_type_name + '\'' +
                ", major_name='" + major_name + '\'' +
                ", school_name='" + school_name + '\'' +
                ", dy_zw_allowed=" + dy_zw_allowed +
                '}';
    }

    public String getMajor_name() {
        return major_name;
    }

    public void setMajor_name(String major_name) {
        this.major_name = major_name;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getBk_major() {
        return bk_major;
    }

    public void setBk_major(int bk_major) {
        this.bk_major = bk_major;
    }

    public int getTarget_school_id() {
        return target_school_id;
    }

    public void setTarget_school_id(int target_school_id) {
        this.target_school_id = target_school_id;
    }

    public int getPay_state() {
        return pay_state;
    }

    public void setPay_state(int pay_state) {
        this.pay_state = pay_state;
    }

    public String getZkao_num() {
        return zkao_num;
    }

    public void setZkao_num(String zkao_num) {
        this.zkao_num = zkao_num;
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

    public int getKd_id() {
        return kd_id;
    }

    public void setKd_id(int kd_id) {
        this.kd_id = kd_id;
    }

    public int getKaochang_id() {
        return kaochang_id;
    }

    public void setKaochang_id(int kaochang_id) {
        this.kaochang_id = kaochang_id;
    }

    public String getKaotang_code() {
        return kaotang_code;
    }

    public void setKaotang_code(String kaotang_code) {
        this.kaotang_code = kaotang_code;
    }

    public int getSet_num() {
        return set_num;
    }

    public void setSet_num(int set_num) {
        this.set_num = set_num;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getKd_name() {
        return kd_name;
    }

    public void setKd_name(String kd_name) {
        this.kd_name = kd_name;
    }

    public int getPost_code() {
        return post_code;
    }

    public void setPost_code(int post_code) {
        this.post_code = post_code;
    }

    public String getThorough_address() {
        return thorough_address;
    }

    public void setThorough_address(String thorough_address) {
        this.thorough_address = thorough_address;
    }

    public String getKqu_name() {
        return kqu_name;
    }

    public void setKqu_name(String kqu_name) {
        this.kqu_name = kqu_name;
    }

    public Date getDy_zw_s_time() {
        return dy_zw_s_time;
    }

    public void setDy_zw_s_time(Date dy_zw_s_time) {
        this.dy_zw_s_time = dy_zw_s_time;
    }

    public Date getDy_zw_e_time() {
        return dy_zw_e_time;
    }

    public void setDy_zw_e_time(Date dy_zw_e_time) {
        this.dy_zw_e_time = dy_zw_e_time;
    }

    public String getExam_start_time() {
        return exam_start_time;
    }

    public void setExam_start_time(String exam_start_time) {
        this.exam_start_time = exam_start_time;
    }

    public String getExam_end_time() {
        return exam_end_time;
    }

    public void setExam_end_time(String exam_end_time) {
        this.exam_end_time = exam_end_time;
    }

    public String getExam_type_name() {
        return exam_type_name;
    }

    public void setExam_type_name(String exam_type_name) {
        this.exam_type_name = exam_type_name;
    }

    public int getDy_zw_allowed() {
        return dy_zw_allowed;
    }

    public void setDy_zw_allowed(int dy_zw_allowed) {
        this.dy_zw_allowed = dy_zw_allowed;
    }
}
