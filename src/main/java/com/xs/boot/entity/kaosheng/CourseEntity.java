package com.xs.boot.entity.kaosheng;

/**
 * Created by FF on 2020/6/24.
 */
public class CourseEntity {
    private int course_id;
    private String name;
    private double money;
    private int pay_state;

    public int getPay_state() {
        return pay_state;
    }

    public void setPay_state(int pay_state) {
        this.pay_state = pay_state;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "course_id=" + course_id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", pay_state=" + pay_state +
                '}';
    }
}
