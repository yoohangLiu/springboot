package com.xs.boot.entity;

/**
 * Created by DELL on 2020/6/22.
 */
public class Courses {
    private int course_id;
    private String course_name;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    private double money;

    @Override
    public String toString() {
        return "Courses{" +
                "course_id=" + course_id +
                ", course_name='" + course_name + '\'' +
                ", money=" + money +
                '}';
    }
}
