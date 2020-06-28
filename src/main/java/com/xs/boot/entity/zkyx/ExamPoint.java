package com.xs.boot.entity.zkyx;

public class ExamPoint {
    private int kd_id;
    private String kd_name;
    private int post_code;
    private int cap_num;
    private String kqu_id;

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

    public int getPost_code() {
        return post_code;
    }

    public void setPost_code(int post_code) {
        this.post_code = post_code;
    }

    public int getCap_num() {
        return cap_num;
    }

    public void setCap_num(int cap_num) {
        this.cap_num = cap_num;
    }


    public void setKqu_id(String kqu_id) {
        this.kqu_id = kqu_id;
    }

    public String getKqu_id() {
        return kqu_id;
    }
}
