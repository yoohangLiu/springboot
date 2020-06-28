package com.xs.boot.entity.kaosheng;

/**
 * Created by FF on 2020/6/26.
 */
//用于限制【查询考试座位信息】的实体
public class SeatLimitParamsEntity {
    private int student_id;
    private int stu_type;// 动态拼接选择限制条件

    @Override
    public String toString() {
        return "SeatLimitParamsEntity{" +
                "student_id=" + student_id +
                ", stu_type=" + stu_type +
                '}';
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getStu_type() {
        return stu_type;
    }

    public void setStu_type(int stu_type) {
        this.stu_type = stu_type;
    }
}
