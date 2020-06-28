package com.xs.boot.entity;

import java.util.Date;

/**
 * Created by asus on 2020/6/25.
 */
public class Sche {
    private int type_name;
    private int kc_code;
    private int kd_id;
    private String kd_name;
    private Date start_time;
    private Date end_time;

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

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    @Override
    public String toString() {
        return "Sche{" +
                "type_name=" + type_name +
                ", kc_code=" + kc_code +
                ", kd_id=" + kd_id +
                ", kd_name='" + kd_name + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                '}';
    }
}
