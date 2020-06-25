package com.xs.boot.service.impl;

import com.xs.boot.dao.KaoBanMapper;
import com.xs.boot.entity.Certain_exam_examArea;
import com.xs.boot.entity.Certain_kqu_kd;
import com.xs.boot.entity.Lingjuan_list;
import com.xs.boot.entity.Orgnization_memo;
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


}
