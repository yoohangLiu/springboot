package com.xs.boot.entity;

/**
 * Created by FF on 2020/6/16.
 */
public class Exam {
    private int id;
    private int exam_num;
    private String exam_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExam_num() {
        return exam_num;
    }

    public void setExam_num(int exam_num) {
        this.exam_num = exam_num;
    }

    public String  getExam_type() {
        return exam_type;
    }

    public void setExam_type(String  exam_type) {
        this.exam_type = exam_type;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", exam_num=" + exam_num +
                ", exam_type=" + exam_type +
                '}';
    }
}
