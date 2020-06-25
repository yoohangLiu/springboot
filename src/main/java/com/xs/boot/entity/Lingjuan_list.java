package com.xs.boot.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Lingjuan_list {
    int kc_code;
    String city_code;
    String kqu_id;
    String leader_name ;
    String leader_address;
    String leader_phone ;
    String leader_id ;//身份证号
    String chepai_zuoci;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    Date lingjuan_date ;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    Date return_paper_stime ;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    Date return_paper_etime ;

    public String getKqu_id() {
        return kqu_id;
    }

    public void setKqu_id(String kqu_id) {
        this.kqu_id = kqu_id;
    }


    @Override
    public String toString() {
        return "Lingjuan_list{" +
                "kc_code=" + kc_code +
                ", city_code='" + city_code + '\'' +
                ", leader_name='" + leader_name + '\'' +
                ", leader_address='" + leader_address + '\'' +
                ", leader_phone='" + leader_phone + '\'' +
                ", leader_id='" + leader_id + '\'' +
                ", chepai_zuoci='" + chepai_zuoci + '\'' +
                ", lingjuan_date=" + lingjuan_date +
                ", return_paper_stime=" + return_paper_stime +
                ", return_paper_etime=" + return_paper_etime +
                '}';
    }

    public Lingjuan_list() {
    }

    public int getKc_code() {
        return kc_code;
    }

    public void setKc_code(int kc_code) {
        this.kc_code = kc_code;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getLeader_name() {
        return leader_name;
    }

    public void setLeader_name(String leader_name) {
        this.leader_name = leader_name;
    }

    public String getLeader_address() {
        return leader_address;
    }

    public void setLeader_address(String leader_address) {
        this.leader_address = leader_address;
    }

    public String getLeader_phone() {
        return leader_phone;
    }

    public void setLeader_phone(String leader_phone) {
        this.leader_phone = leader_phone;
    }

    public String getLeader_id() {
        return leader_id;
    }

    public void setLeader_id(String leader_id) {
        this.leader_id = leader_id;
    }

    public String getChepai_zuoci() {
        return chepai_zuoci;
    }

    public void setChepai_zuoci(String chepai_zuoci) {
        this.chepai_zuoci = chepai_zuoci;
    }

    public Date getLingjuan_date() {
        return lingjuan_date;
    }

    public void setLingjuan_date(Date lingjuan_date) {
        this.lingjuan_date = lingjuan_date;
    }

    public Date getReturn_paper_stime() {
        return return_paper_stime;
    }

    public void setReturn_paper_stime(Date return_paper_stime) {
        this.return_paper_stime = return_paper_stime;
    }

    public Date getReturn_paper_etime() {
        return return_paper_etime;
    }

    public void setReturn_paper_etime(Date return_paper_etime) {
        this.return_paper_etime = return_paper_etime;
    }
}
