package com.xs.boot.entity.kaosheng;

import java.util.Date;

public class ExamEntity {
    private int exam_id;
    private int kc_code;
    private int type_name;
    private int juandai_spec;
    private int creator_id;
    private Date create_time;
    private Date bm_begin_time;
    private Date bm_end_time;
    private Date sh_bk_s_time;
    private Date sh_bk_e_time;
    private Date yy_bk_s_time;
    private Date yy_bk_e_time;
    private Date bc_begin_time;
    private Date bc_end_time;
    private Date xcqr_begin_time;
    private Date xcqr_end_time;
    private Date dy_zw_s_time;
    private Date dy_zw_e_time;
    private Date dy_zkz_s_time;
    private Date dy_zkz_e_time;
    private Date exam_start_time;
    private Date exam_end_time;


    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

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

    public int getJuandai_spec() {
        return juandai_spec;
    }

    public void setJuandai_spec(int juandai_spec) {
        this.juandai_spec = juandai_spec;
    }

    public int getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(int creator_id) {
        this.creator_id = creator_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getBm_begin_time() {
        return bm_begin_time;
    }

    public void setBm_begin_time(Date bm_begin_time) {
        this.bm_begin_time = bm_begin_time;
    }

    public Date getBm_end_time() {
        return bm_end_time;
    }

    public void setBm_end_time(Date bm_end_time) {
        this.bm_end_time = bm_end_time;
    }

    public Date getSh_bk_s_time() {
        return sh_bk_s_time;
    }

    public void setSh_bk_s_time(Date sh_bk_s_time) {
        this.sh_bk_s_time = sh_bk_s_time;
    }

    public Date getSh_bk_e_time() {
        return sh_bk_e_time;
    }

    public void setSh_bk_e_time(Date sh_bk_e_time) {
        this.sh_bk_e_time = sh_bk_e_time;
    }

    public Date getYy_bk_s_time() {
        return yy_bk_s_time;
    }

    public void setYy_bk_s_time(Date yy_bk_s_time) {
        this.yy_bk_s_time = yy_bk_s_time;
    }

    public Date getYy_bk_e_time() {
        return yy_bk_e_time;
    }

    public void setYy_bk_e_time(Date yy_bk_e_time) {
        this.yy_bk_e_time = yy_bk_e_time;
    }

    public Date getBc_begin_time() {
        return bc_begin_time;
    }

    public void setBc_begin_time(Date bc_begin_time) {
        this.bc_begin_time = bc_begin_time;
    }

    public Date getBc_end_time() {
        return bc_end_time;
    }

    public void setBc_end_time(Date bc_end_time) {
        this.bc_end_time = bc_end_time;
    }

    public Date getXcqr_begin_time() {
        return xcqr_begin_time;
    }

    public void setXcqr_begin_time(Date xcqr_begin_time) {
        this.xcqr_begin_time = xcqr_begin_time;
    }

    public Date getXcqr_end_time() {
        return xcqr_end_time;
    }

    public void setXcqr_end_time(Date xcqr_end_time) {
        this.xcqr_end_time = xcqr_end_time;
    }

    public Date getDy_zw_s_time() {
        return dy_zw_s_time;
    }

    public void setDy_zw_s_time(Date dy_zw_s_time) {
        this.dy_zw_s_time = dy_zw_s_time;
    }

    public Date getDy_zw_e_time() {
        return dy_zw_e_time;
    }

    public void setDy_zw_e_time(Date dy_zw_e_time) {
        this.dy_zw_e_time = dy_zw_e_time;
    }

    public Date getDy_zkz_s_time() {
        return dy_zkz_s_time;
    }

    public void setDy_zkz_s_time(Date dy_zkz_s_time) {
        this.dy_zkz_s_time = dy_zkz_s_time;
    }

    public Date getDy_zkz_e_time() {
        return dy_zkz_e_time;
    }

    public void setDy_zkz_e_time(Date dy_zkz_e_time) {
        this.dy_zkz_e_time = dy_zkz_e_time;
    }

    public Date getExam_start_time() {
        return exam_start_time;
    }

    public void setExam_start_time(Date exam_start_time) {
        this.exam_start_time = exam_start_time;
    }

    public Date getExam_end_time() {
        return exam_end_time;
    }

    public void setExam_end_time(Date exam_end_time) {
        this.exam_end_time = exam_end_time;
    }

    @Override
    public String toString() {
        return "ExamEntity{" +
                "exam_id=" + exam_id +
                ", kc_code=" + kc_code +
                ", type_name=" + type_name +
                ", juandai_spec=" + juandai_spec +
                ", creator_id=" + creator_id +
                ", create_time=" + create_time +
                ", bm_begin_time=" + bm_begin_time +
                ", bm_end_time=" + bm_end_time +
                ", sh_bk_s_time=" + sh_bk_s_time +
                ", sh_bk_e_time=" + sh_bk_e_time +
                ", yy_bk_s_time=" + yy_bk_s_time +
                ", yy_bk_e_time=" + yy_bk_e_time +
                ", bc_begin_time=" + bc_begin_time +
                ", bc_end_time=" + bc_end_time +
                ", xcqr_begin_time=" + xcqr_begin_time +
                ", xcqr_end_time=" + xcqr_end_time +
                ", dy_zw_s_time=" + dy_zw_s_time +
                ", dy_zw_e_time=" + dy_zw_e_time +
                ", dy_zkz_s_time=" + dy_zkz_s_time +
                ", dy_zkz_e_time=" + dy_zkz_e_time +
                ", exam_start_time=" + exam_start_time +
                ", exam_end_time=" + exam_end_time +
                '}';
    }
}
