package com.xs.boot.entity.zkyx;

public class WhiteList {
    private int school_id;
    private int student_id;

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "white_list{" +
                "school_id=" + school_id +
                ", student_id=" + student_id +
                '}';
    }
}
