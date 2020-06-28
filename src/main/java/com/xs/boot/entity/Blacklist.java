package com.xs.boot.entity;

/**
 * Created by asus on 2020/6/24.
 */
public class Blacklist {
    private int id;
    private int kc_code;
    private int type_name;
    private int school_id;

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

    public int getType_name() {
        return type_name;
    }

    public void setType_name(int type_name) {
        this.type_name = type_name;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    @Override
    public String toString() {
        return "Blacklist{" +
                "id=" + id +
                ", kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", school_id=" + school_id +
                '}';
    }
}
