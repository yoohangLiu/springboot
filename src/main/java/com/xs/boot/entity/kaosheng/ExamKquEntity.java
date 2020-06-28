package com.xs.boot.entity.kaosheng;

public class ExamKquEntity {
    private int kc_code;
    private int type_name;
    private String kqu_id;
    private String city_code;
    private String district_code;

    @Override
    public String toString() {
        return "ExamKquEntity{" +
                "kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", kqu_id='" + kqu_id + '\'' +
                ", city_code='" + city_code + '\'' +
                ", district_code='" + district_code + '\'' +
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

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getDistrict_code() {
        return district_code;
    }

    public void setDistrict_code(String district_code) {
        this.district_code = district_code;
    }
}
