package com.xs.boot.service.impl;

import com.xs.boot.dao.KaoBanMapper;
import com.xs.boot.entity.*;
import com.xs.boot.service.IKaoBanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class IKaoBanServiceImpl implements IKaoBanService {
    @Resource
    private KaoBanMapper kaoBanMapper;

    @Override
    public List<Certain_exam_examArea> find_exam(Certain_exam_examArea kqu_id) {
        return kaoBanMapper.find_exam(kqu_id);
    }

    @Transactional
    @Override
    public List<Certain_kqu_kd> find_kqu_kd(Certain_kqu_kd certain_kqu_kd) {
        return kaoBanMapper.find_kqu_kd(certain_kqu_kd);
    }

    @Override
    public void addCapacity(Certain_exam_examArea certain_exam_examArea) {
        kaoBanMapper.addCapacity(certain_exam_examArea);
    }

    @Override
    public void alterCertainKquKd(Certain_kqu_kd certain_kqu_kd) {
        kaoBanMapper.alterCertainKquKd(certain_kqu_kd);
    }

    @Override
    public Orgnization_memo find_exam2(Orgnization_memo kqu_id) {
        return kaoBanMapper.find_exam2(kqu_id);
    }

    @Override
    public void addOrganizationMemo(Orgnization_memo certain_exam_examArea) {
        kaoBanMapper.addOrganazationMemo(certain_exam_examArea);
    }

    @Override
    public List<Lingjuan_list> find_tongkao(Lingjuan_list kqu_id) {
        return kaoBanMapper.find_tongkao(kqu_id);
    }

    @Override
    public Lingjuan_list find_Lingjuan(Lingjuan_list kqu_id) {
        return kaoBanMapper.find_Lingjuan(kqu_id);
    }

    @Override
    public void addLingjuanList(Lingjuan_list certain_exam_examArea) {
        kaoBanMapper.addLingjuanList(certain_exam_examArea);
    }

    @Override
    public List<Violist> find_vioList(Violist kqu_id) {
        return kaoBanMapper.find_vioList(kqu_id);
    }

    @Override
    public void addViolationList(Violist certain_exam_examArea) {
        kaoBanMapper.addViolationList(certain_exam_examArea);
    }

    @Override
    public List<Kd_info> find_total_kd() {
       return kaoBanMapper.find_total_kd();
    }

    @Override
    public Kd_info find_max_kd_id() {
        return kaoBanMapper.findMaxKd_id();
    }

    @Override
    public void addKd_info(Kd_info certain_exam_examArea) {
        kaoBanMapper.addKd_info(certain_exam_examArea);
    }

    @Override
    public void delete_kd_info(Kd_info certain_exam_examArea) {
        kaoBanMapper.delete_kd_info(certain_exam_examArea);
    }

    @Override
    public List<Certain_kqu_kd> find_exam3(Certain_kqu_kd kqu_id) {
        return kaoBanMapper.find_exam3(kqu_id);
    }

    @Override
    public void alterCertainKquKd2(Certain_kqu_kd certain_kqu_kd) {
        kaoBanMapper.alterCertainKquKd2(certain_kqu_kd);
    }

    @Override
    public void insert_certain_kqu_kd(Certain_kqu_kd certain_kqu_kd) {
        kaoBanMapper.insert_certain_kqu_kd(certain_kqu_kd);
    }

    @Override
    public List<Certain_exam_examArea> find_shizhou_certain_area(Certain_exam_examArea kqu_id) {
        return kaoBanMapper.find_shizhou_certain_area(kqu_id);
    }

    @Override
    public void insert_Certain_Kqu(Certain_exam_examArea certain_kqu_kd) {
        kaoBanMapper.insert_Certain_Kqu(certain_kqu_kd);
    }

    @Override
    public List<StudentInfo> find_student_info(StudentInfo certain_kqu_kd) {
       return kaoBanMapper.find_student_info(certain_kqu_kd);
    }

    @Override
    public void alterOneState(StudentInfo certain_kqu_kd) {
        kaoBanMapper.alterOneState(certain_kqu_kd);
    }

    @Override
    public void alterAllState(StudentInfo certain_kqu_kd) {
        kaoBanMapper.alterAllState(certain_kqu_kd);
    }

    @Override
    public List<Certain_exam_examArea> select_bk_student_num(Certain_exam_examArea kqu_id) {
        return kaoBanMapper.select_bk_student_num(kqu_id);
    }

    @Override
    public List<Certain_kqu_kd> select_kaochang_spec_and_num(Certain_kqu_kd kqu_id) {
        return kaoBanMapper.select_kaochang_spec_and_num(kqu_id);
    }


}
