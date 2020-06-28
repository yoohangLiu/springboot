package com.xs.boot.entity.myKaoban;

/**
 * Created by DELL on 2020/6/22.
 */
public class Violist {
    private int id;
    private int kc_code;
    private int exam_type;
    private int course_id;
    private int kqu_id;
    private int kd_id;
    private int kaochang_id;
    private String kd_name;





    public String getKd_name() {
        return kd_name;
    }

    public void setKd_name(String kd_name) {
        this.kd_name = kd_name;
    }

    private String thorough_address;
    public int getKqu_id() {
        return kqu_id;
    }

    public void setKqu_id(int kqu_id) {
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

    private String name;
    private String start_time;
    private String end_time;
    private String kaotang_code;
    private String zkao_num;

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String stu_name;
    private int jianyi_punish_id;
    private String violation_name;
    private String suggest_deal;
    private int shangbao_state;
    private String memo;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getKc_code() {
        return kc_code;
    }

    public void setKc_code(int kc_code) {
        this.kc_code = kc_code;
    }

    public int getExam_type() {
        return exam_type;
    }

    public void setExam_type(int exam_type) {
        this.exam_type = exam_type;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }


    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getKaotang_code() {
        return kaotang_code;
    }

    public void setKaotang_code(String kaotang_code) {
        this.kaotang_code = kaotang_code;
    }

    public String getZkao_num() {
        return zkao_num;
    }

    public void setZkao_num(String zkao_num) {
        this.zkao_num = zkao_num;
    }

    public int getJianyi_punish_id() {
        return jianyi_punish_id;
    }

    public void setJianyi_punish_id(int jianyi_punish_id) {
        this.jianyi_punish_id = jianyi_punish_id;
    }

    public String getViolation_name() {
        return violation_name;
    }

    public void setViolation_name(String violation_name) {
        this.violation_name = violation_name;
    }

    public String getSuggest_deal() {
        return suggest_deal;
    }

    public void setSuggest_deal(String suggest_deal) {
        this.suggest_deal = suggest_deal;
    }

    public int getShangbao_state() {
        return shangbao_state;
    }

    public void setShangbao_state(int shangbao_state) {
        this.shangbao_state = shangbao_state;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
