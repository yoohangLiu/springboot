package com.xs.boot.entity.kaosheng;

/**
 * Created by FF on 2020/6/22.
 */

//插入和更新的时候用这个
public class StudentInfoEntity {
    private int studentId;
    private String zkaoNum;
    private String stuName;
    private Integer sex;
    private Integer zjType;
    private String zjNum;
    private Integer age;
    private String nation;
    private Integer zzmm;
    private Integer hujiType;
    private Integer bkLevel;
    private Integer bkMajor;
    private String phone;
    private Integer health;
    private Integer stuType;
    private Integer yyXuejiSchoolId;
    private String stuImg;
    private String szNum;
    private String qxNum;
    private Integer tagetSchoolId;
    private String opTime;
    private Integer bmState;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getZkaoNum() {
        return zkaoNum;
    }

    public void setZkaoNum(String zkaoNum) {
        this.zkaoNum = zkaoNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getZjType() {
        return zjType;
    }

    public void setZjType(Integer zjType) {
        this.zjType = zjType;
    }

    public String getZjNum() {
        return zjNum;
    }

    public void setZjNum(String zjNum) {
        this.zjNum = zjNum;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getZzmm() {
        return zzmm;
    }

    public void setZzmm(Integer zzmm) {
        this.zzmm = zzmm;
    }

    public Integer getHujiType() {
        return hujiType;
    }

    public void setHujiType(Integer hujiType) {
        this.hujiType = hujiType;
    }

    public Integer getBkLevel() {
        return bkLevel;
    }

    public void setBkLevel(Integer bkLevel) {
        this.bkLevel = bkLevel;
    }

    public Integer getBkMajor() {
        return bkMajor;
    }

    public void setBkMajor(Integer bkMajor) {
        this.bkMajor = bkMajor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getStuType() {
        return stuType;
    }

    public void setStuType(Integer stuType) {
        this.stuType = stuType;
    }

    public Integer getYyXuejiSchoolId() {
        return yyXuejiSchoolId;
    }

    public void setYyXuejiSchoolId(Integer yyXuejiSchoolId) {
        this.yyXuejiSchoolId = yyXuejiSchoolId;
    }

    public String getStuImg() {
        return stuImg;
    }

    public void setStuImg(String stuImg) {
        this.stuImg = stuImg;
    }

    public String getSzNum() {
        return szNum;
    }

    public void setSzNum(String szNum) {
        this.szNum = szNum;
    }

    public String getQxNum() {
        return qxNum;
    }

    public void setQxNum(String qxNum) {
        this.qxNum = qxNum;
    }

    public Integer getTagetSchoolId() {
        return tagetSchoolId;
    }

    public void setTagetSchoolId(Integer tagetSchoolId) {
        this.tagetSchoolId = tagetSchoolId;
    }

    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

    public Integer getBmState() {
        return bmState;
    }

    public void setBmState(Integer bmState) {
        this.bmState = bmState;
    }

    public String toString() {
        return "StudentInfoEntity{" + "studentId=" + studentId + ", zkaoNum='" + zkaoNum + '\'' + ", stuName='"
                + stuName + '\'' + ", sex=" + sex + ", zjType=" + zjType + ", zjNum='" + zjNum + '\'' + ", age=" + age
                + ", nation=" + nation + ", zzmm=" + zzmm + ", hujiType=" + hujiType + ", bkLevel=" + bkLevel
                + ", bkMajor=" + bkMajor + ", phone='" + phone + '\'' + ", health=" + health + ", stuType=" + stuType
                + ", yyXuejiSchoolId=" + yyXuejiSchoolId + ", stuImg='" + stuImg + '\'' + ", szNum='" + szNum + '\''
                + ", qxNum='" + qxNum + '\'' + ", tagetSchoolId=" + tagetSchoolId + ", opTime=" + opTime + ", bmState="
                + bmState + '}';
    }
}
