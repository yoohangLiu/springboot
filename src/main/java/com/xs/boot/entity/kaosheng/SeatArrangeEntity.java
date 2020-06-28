package com.xs.boot.entity.kaosheng;

import java.util.Date;

/**
 * Created by FF on 2020/6/25.
 */
public class SeatArrangeEntity {
    private String zj_num;// 前端 1

    private int student_id;// 前端 1
    private String stu_name;// 前端 1

    private String zkao_num;// 前端 1

    private int kc_code;// 后端处理 1
    private int type_name;// 后端处理 1
    private String exam_type_name;// 1
    private int bk_course_id;// 前端 1
    private String bk_course_name;// 前端 1

    private String kqu_id;
    private String kqu_name;// 查出来之后再匹配

    private int kd_id;
    private String kd_name;// 查出来之后再匹配

    private int kaochang_id;
    private String thorough_address;// 查出来之后再匹配

    private String kaotang_code;
    private int set_num;

    private int dy_zw_allowed;// 根据当前时间设置

    // 根据 kc_code type_name 查 exam 表
    private Date dy_zw_s_time;//
    private Date dy_zw_e_time;//
    private Date exam_start_time;//
    private Date exam_end_time;//

    @Override
    public String toString() {
        return "SeatArrangeEntity{" +
                "zj_num='" + zj_num + '\'' +
                ", student_id=" + student_id +
                ", stu_name='" + stu_name + '\'' +
                ", zkao_num='" + zkao_num + '\'' +
                ", kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", exam_type_name='" + exam_type_name + '\'' +
                ", bk_course_id=" + bk_course_id +
                ", bk_course_name='" + bk_course_name + '\'' +
                ", kqu_id='" + kqu_id + '\'' +
                ", kqu_name='" + kqu_name + '\'' +
                ", kd_id=" + kd_id +
                ", kd_name='" + kd_name + '\'' +
                ", kaochang_id=" + kaochang_id +
                ", thorough_address='" + thorough_address + '\'' +
                ", kaotang_code='" + kaotang_code + '\'' +
                ", set_num=" + set_num +
                ", dy_zw_allowed=" + dy_zw_allowed +
                ", dy_zw_s_time=" + dy_zw_s_time +
                ", dy_zw_e_time=" + dy_zw_e_time +
                ", exam_start_time=" + exam_start_time +
                ", exam_end_time=" + exam_end_time +
                '}';
    }

    public String getZj_num() {
        return zj_num;
    }

    public void setZj_num(String zj_num) {
        this.zj_num = zj_num;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
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

    public String getExam_type_name() {
        return exam_type_name;
    }

    public void setExam_type_name(String exam_type_name) {
        this.exam_type_name = exam_type_name;
    }

    public int getBk_course_id() {
        return bk_course_id;
    }

    public void setBk_course_id(int bk_course_id) {
        this.bk_course_id = bk_course_id;
    }

    public String getBk_course_name() {
        return bk_course_name;
    }

    public void setBk_course_name(String bk_course_name) {
        this.bk_course_name = bk_course_name;
    }

    public String getKqu_id() {
        return kqu_id;
    }

    public void setKqu_id(String kqu_id) {
        this.kqu_id = kqu_id;
    }

    public String getKqu_name() {
        return kqu_name;
    }

    public void setKqu_name(String kqu_name) {
        this.kqu_name = kqu_name;
    }

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

    public int getKaochang_id() {
        return kaochang_id;
    }

    public void setKaochang_id(int kaochang_id) {
        this.kaochang_id = kaochang_id;
    }

    public String getThorough_address() {
        return thorough_address;
    }

    public void setThorough_address(String thorough_address) {
        this.thorough_address = thorough_address;
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

    public int getDy_zw_allowed() {
        return dy_zw_allowed;
    }

    public void setDy_zw_allowed(int dy_zw_allowed) {
        this.dy_zw_allowed = dy_zw_allowed;
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

    public Date getExam_start_time() {
        return exam_start_time;
    }

    public void setExam_start_time(Date exam_start_time) {
        this.exam_start_time = exam_start_time;
    }

    public Date getExam_end_time() {
        return exam_end_time;
    }

    public void setExam_end_time(Date exam_end_time) {
        this.exam_end_time = exam_end_time;
    }
}
