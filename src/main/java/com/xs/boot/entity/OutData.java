package com.xs.boot.entity;

/**
 * Created by DELL on 2020/6/24.
 */
public class OutData {
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

    public int getBk_major_id() {
        return bk_major_id;
    }

    public void setBk_major_id(int bk_major_id) {
        this.bk_major_id = bk_major_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    private int kc_code;
    private int type_name;
    private int bk_major_id;
    private String name;
    private int sum;

    @Override
    public String toString() {
        return "OutData{" +
                "kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", bk_major_id=" + bk_major_id +
                ", name='" + name + '\'' +
                ", sum=" + sum +
                '}';
    }
}
