package com.xs.boot.entity.kaosheng;

/**
 * Created by FF on 2020/6/23.
 */
public class ZhuKaoSchoolEntity {
    private int school_id;
    private String school_name;

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    @Override
    public String toString() {
        return "ZhuKaoSchoolEntity{" +
                "school_id=" + school_id +
                ", school_name='" + school_name + '\'' +
                '}';
    }
}
