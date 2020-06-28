package com.xs.boot.entity.zkyx;

import javax.annotation.Resource;

public class Other {
    @Resource
    private int kc_code;
    private int type_name;
    private int school_id;
    private String path;
    private int kind;

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

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path =path;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Other{" +
                "kc_code=" + kc_code +
                ", type_name='" + type_name + '\'' +
                ", school_id='" + school_id + '\'' +
                ", path='" + path + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
