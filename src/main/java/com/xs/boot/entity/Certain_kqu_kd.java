package com.xs.boot.entity;

public class Certain_kqu_kd {
    private int kc_code;
    private int type_name ;
    private String kqu_id ;
    private int    kd_id  ;
    private int kd_state  ;
    private int  kd_type   ;
    private String belong_code ;
    private int supervisor_num;
    private String contactor ;
    private String phone  ;
    private int kaochang_spec ;
    private int kaochang_num ;
    private String memo;

    public Certain_kqu_kd() {
    }

    @Override
    public String toString() {
        return "Certain_kqu_kd{" +
                "kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", kqu_id='" + kqu_id + '\'' +
                ", kd_id=" + kd_id +
                ", kd_state=" + kd_state +
                ", kd_type=" + kd_type +
                ", belong_code='" + belong_code + '\'' +
                ", supervisor_num=" + supervisor_num +
                ", contactor='" + contactor + '\'' +
                ", phone='" + phone + '\'' +
                ", kaochang_spec=" + kaochang_spec +
                ", kaochang_num=" + kaochang_num +
                ", memo='" + memo + '\'' +
                '}';
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

    public int getKd_state() {
        return kd_state;
    }

    public void setKd_state(int kd_state) {
        this.kd_state = kd_state;
    }

    public int getKd_type() {
        return kd_type;
    }

    public void setKd_type(int kd_type) {
        this.kd_type = kd_type;
    }

    public String getBelong_code() {
        return belong_code;
    }

    public void setBelong_code(String belong_code) {
        this.belong_code = belong_code;
    }

    public int getSupervisor_num() {
        return supervisor_num;
    }

    public void setSupervisor_num(int supervisor_num) {
        this.supervisor_num = supervisor_num;
    }

    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getKaochang_spec() {
        return kaochang_spec;
    }

    public void setKaochang_spec(int kaochang_spec) {
        this.kaochang_spec = kaochang_spec;
    }

    public int getKaochang_num() {
        return kaochang_num;
    }

    public void setKaochang_num(int kaochang_num) {
        this.kaochang_num = kaochang_num;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
