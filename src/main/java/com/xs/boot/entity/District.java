package com.xs.boot.entity;

/**
 * Created by asus on 2020/6/23.
 */
public class District {
    private String city_code;
    private String city_name;
    private String district_code;
    private String district_name;
    private String kqu_id;
    private String kqu_name;

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getDistrict_code() {
        return district_code;
    }

    public void setDistrict_code(String district_code) {
        this.district_code = district_code;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getKqu_id() {
        return city_code + district_code;
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

    @Override
    public String toString() {
        return "District{" +
                "city_code='" + city_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", district_code='" + district_code + '\'' +
                ", district_name='" + district_name + '\'' +
                ", kqu_id='" + kqu_id + '\'' +
                ", kqu_name='" + kqu_name + '\'' +
                '}';
    }
}
