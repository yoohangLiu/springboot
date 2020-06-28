package com.xs.boot.entity.util;

public class UserEntity {
    private int table_id;
    private String account;
    private String password;
    private int user_type;
    private String city_code;
    private String district_code;
    private int school_id;

    // 拼接市州代码和区县代码，并存入session
    private String kqu_id;

    // 方便前端显示
    private String stu_name;
    private String operator_name; // 其他角色账户名字
    private String user_type_name;
    private String stu_img;

    @Override
    public String toString() {
        return "UserEntity{" +
                "table_id=" + table_id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", user_type=" + user_type +
                ", city_code='" + city_code + '\'' +
                ", district_code='" + district_code + '\'' +
                ", school_id=" + school_id +
                ", kqu_id='" + kqu_id + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", operator_name='" + operator_name + '\'' +
                ", user_type_name='" + user_type_name + '\'' +
                ", stu_img='" + stu_img + '\'' +
                '}';
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name;
    }

    public String getUser_type_name() {
        return user_type_name;
    }

    public void setUser_type_name(String user_type_name) {
        this.user_type_name = user_type_name;
    }

    public String getStu_img() {
        return stu_img;
    }

    public void setStu_img(String stu_img) {
        this.stu_img = stu_img;
    }

    public String getKqu_id() {
        return kqu_id;
    }

    public void setKqu_id(String kqu_id) {
        this.kqu_id = kqu_id;
    }

    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
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

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }
}
