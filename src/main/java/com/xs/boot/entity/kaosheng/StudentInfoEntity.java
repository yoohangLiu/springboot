package com.xs.boot.entity.kaosheng;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by FF on 2020/6/22.
 */
@Entity
@javax.persistence.Table(name = "student_info", schema = "group2", catalog = "")
public class StudentInfoEntity {
    private int studentId;

    @Id
    @javax.persistence.Column(name = "student_id", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private String zkaoNum;

    @Basic
    @javax.persistence.Column(name = "zkao_num", nullable = true, length = 255)
    public String getZkaoNum() {
        return zkaoNum;
    }

    public void setZkaoNum(String zkaoNum) {
        this.zkaoNum = zkaoNum;
    }

    private String stuName;

    @Basic
    @javax.persistence.Column(name = "stu_name", nullable = true, length = 255)
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    private Integer sex;

    @Basic
    @javax.persistence.Column(name = "sex", nullable = true)
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    private Integer zjType;

    @Basic
    @javax.persistence.Column(name = "zj_type", nullable = true)
    public Integer getZjType() {
        return zjType;
    }

    public void setZjType(Integer zjType) {
        this.zjType = zjType;
    }

    private String zjNum;

    @Basic
    @javax.persistence.Column(name = "zj_num", nullable = true, length = 255)
    public String getZjNum() {
        return zjNum;
    }

    public void setZjNum(String zjNum) {
        this.zjNum = zjNum;
    }

    private Integer age;

    @Basic
    @javax.persistence.Column(name = "age", nullable = true)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String nation;

    @Basic
    @javax.persistence.Column(name = "nation", nullable = true)
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    private Integer zzmm;

    @Basic
    @javax.persistence.Column(name = "zzmm", nullable = true)
    public Integer getZzmm() {
        return zzmm;
    }

    public void setZzmm(Integer zzmm) {
        this.zzmm = zzmm;
    }

    private Integer hujiType;

    @Basic
    @javax.persistence.Column(name = "huji_type", nullable = true)
    public Integer getHujiType() {
        return hujiType;
    }

    public void setHujiType(Integer hujiType) {
        this.hujiType = hujiType;
    }

    private Integer bkLevel;

    @Basic
    @javax.persistence.Column(name = "bk_level", nullable = true)
    public Integer getBkLevel() {
        return bkLevel;
    }

    public void setBkLevel(Integer bkLevel) {
        this.bkLevel = bkLevel;
    }

    private Integer bkMajor;

    @Basic
    @javax.persistence.Column(name = "bk_major", nullable = true)
    public Integer getBkMajor() {
        return bkMajor;
    }

    public void setBkMajor(Integer bkMajor) {
        this.bkMajor = bkMajor;
    }

    private String phone;

    @Basic
    @javax.persistence.Column(name = "phone", nullable = true, length = 255)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Integer health;

    @Basic
    @javax.persistence.Column(name = "health", nullable = true)
    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    private Integer stuType;

    @Basic
    @javax.persistence.Column(name = "stu_type", nullable = true)
    public Integer getStuType() {
        return stuType;
    }

    public void setStuType(Integer stuType) {
        this.stuType = stuType;
    }

    private Integer yyXuejiSchoolId;

    @Basic
    @javax.persistence.Column(name = "yy_xueji_school_id", nullable = true)
    public Integer getYyXuejiSchoolId() {
        return yyXuejiSchoolId;
    }

    public void setYyXuejiSchoolId(Integer yyXuejiSchoolId) {
        this.yyXuejiSchoolId = yyXuejiSchoolId;
    }

    private String stuImg;

    @Basic
    @javax.persistence.Column(name = "stu_img", nullable = true, length = 255)
    public String getStuImg() {
        return stuImg;
    }

    public void setStuImg(String stuImg) {
        this.stuImg = stuImg;
    }

    private String szNum;

    @Basic
    @javax.persistence.Column(name = "sz_num", nullable = true, length = 255)
    public String getSzNum() {
        return szNum;
    }

    public void setSzNum(String szNum) {
        this.szNum = szNum;
    }

    private String qxNum;

    @Basic
    @javax.persistence.Column(name = "qx_num", nullable = true, length = 255)
    public String getQxNum() {
        return qxNum;
    }

    public void setQxNum(String qxNum) {
        this.qxNum = qxNum;
    }

    private Integer tagetSchoolId;

    @Basic
    @javax.persistence.Column(name = "taget_school_id", nullable = true)
    public Integer getTagetSchoolId() {
        return tagetSchoolId;
    }

    public void setTagetSchoolId(Integer tagetSchoolId) {
        this.tagetSchoolId = tagetSchoolId;
    }

    private Date opTime;

    @Basic
    @javax.persistence.Column(name = "op_time", nullable = true)
    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    private Integer bmState;

    @Basic
    @javax.persistence.Column(name = "bm_state", nullable = true)
    public Integer getBmState() {
        return bmState;
    }

    public void setBmState(Integer bmState) {
        this.bmState = bmState;
    }

    @Override
    public String toString() {
        return "StudentInfoEntity{" +
                "studentId=" + studentId +
                ", zkaoNum='" + zkaoNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", sex=" + sex +
                ", zjType=" + zjType +
                ", zjNum='" + zjNum + '\'' +
                ", age=" + age +
                ", nation=" + nation +
                ", zzmm=" + zzmm +
                ", hujiType=" + hujiType +
                ", bkLevel=" + bkLevel +
                ", bkMajor=" + bkMajor +
                ", phone='" + phone + '\'' +
                ", health=" + health +
                ", stuType=" + stuType +
                ", yyXuejiSchoolId=" + yyXuejiSchoolId +
                ", stuImg='" + stuImg + '\'' +
                ", szNum='" + szNum + '\'' +
                ", qxNum='" + qxNum + '\'' +
                ", tagetSchoolId=" + tagetSchoolId +
                ", opTime=" + opTime +
                ", bmState=" + bmState +
                '}';
    }
}
