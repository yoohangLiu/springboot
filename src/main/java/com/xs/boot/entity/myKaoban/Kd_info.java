package com.xs.boot.entity.myKaoban;

public class Kd_info {
    private int kd_id;
    private String kd_name;
    private int post_code;

    public Kd_info() {
    }

    @Override
    public String toString() {
        return "Kd_info{" +
                "kd_id=" + kd_id +
                ", kd_name='" + kd_name + '\'' +
                ", post_code=" + post_code +
                '}';
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

    public int getPost_code() {
        return post_code;
    }

    public void setPost_code(int post_code) {
        this.post_code = post_code;
    }
}
