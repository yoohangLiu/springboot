package com.xs.boot.entity;

public class Orgnization_memo {
    int kc_code;
    int type_name;
    String kqu_id;
    String secret_room_name;
    String fuze_name;
    String fuze_phone ;
    int jingcha_num ;
    String zk_fuze_name ;
    String zk_fuze_phone;
    String exam_zhiban_phone;
    String technology_name  ;
    String technology_phone ;

    @Override
    public String toString() {
        return "Orgnization_memo{" +
                "kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", kqu_id='" + kqu_id + '\'' +
                ", secret_room_name='" + secret_room_name + '\'' +
                ", fuze_name='" + fuze_name + '\'' +
                ", fuze_phone='" + fuze_phone + '\'' +
                ", jingcha_num=" + jingcha_num +
                ", zk_fuze_name='" + zk_fuze_name + '\'' +
                ", zk_fuze_phone='" + zk_fuze_phone + '\'' +
                ", exam_zhiban_phone='" + exam_zhiban_phone + '\'' +
                ", technology_name='" + technology_name + '\'' +
                ", technology_phone='" + technology_phone + '\'' +
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

    public String getSecret_room_name() {
        return secret_room_name;
    }

    public void setSecret_room_name(String secret_room_name) {
        this.secret_room_name = secret_room_name;
    }

    public String getFuze_name() {
        return fuze_name;
    }

    public void setFuze_name(String fuze_name) {
        this.fuze_name = fuze_name;
    }

    public String getFuze_phone() {
        return fuze_phone;
    }

    public void setFuze_phone(String fuze_phone) {
        this.fuze_phone = fuze_phone;
    }

    public int getJingcha_num() {
        return jingcha_num;
    }

    public void setJingcha_num(int jingcha_num) {
        this.jingcha_num = jingcha_num;
    }

    public String getZk_fuze_name() {
        return zk_fuze_name;
    }

    public void setZk_fuze_name(String zk_fuze_name) {
        this.zk_fuze_name = zk_fuze_name;
    }

    public String getZk_fuze_phone() {
        return zk_fuze_phone;
    }

    public void setZk_fuze_phone(String zk_fuze_phone) {
        this.zk_fuze_phone = zk_fuze_phone;
    }

    public String getExam_zhiban_phone() {
        return exam_zhiban_phone;
    }

    public void setExam_zhiban_phone(String exam_zhiban_phone) {
        this.exam_zhiban_phone = exam_zhiban_phone;
    }

    public String getTechnology_name() {
        return technology_name;
    }

    public void setTechnology_name(String technology_name) {
        this.technology_name = technology_name;
    }

    public String getTechnology_phone() {
        return technology_phone;
    }

    public void setTechnology_phone(String technology_phone) {
        this.technology_phone = technology_phone;
    }
}
