package com.xs.boot.entity;

/**
 * Created by FF on 2020/6/16.
 */
public class Exam {
    private int exam_id;
    private int kc_code;
    private int type_name;

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
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

    @Override
    public String toString() {
        return "Exam{" +
                "exam_id=" + exam_id +
                ", kc_code=" + kc_code +
                ", type_name=" + type_name +
                '}';
    }
}
