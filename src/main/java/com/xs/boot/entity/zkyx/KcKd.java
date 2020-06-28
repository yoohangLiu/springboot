package com.xs.boot.entity.zkyx;

public class KcKd {
    private int kc_code;
    private int type_name;
    private String kqu_id;
    private int kd_id;
    private int kaochang_num;

    public int getKaochang_num() {
        return kaochang_num;
    }

    public void setKaochang_num(int kaochang_num) {
        this.kaochang_num = kaochang_num;
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


    public int getKd_id() {
        return kd_id;
    }

    public void setKd_id(int kd_id) {
        this.kd_id = kd_id;
    }

    public String getKqu_id() {
        return kqu_id;
    }

    public void setKqu_id(String kqu_id) {
        this.kqu_id = kqu_id;
    }
}
