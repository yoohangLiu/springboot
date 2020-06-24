package com.xs.boot.service;



import com.xs.boot.entity.Certain_exam_examArea;
import com.xs.boot.entity.Certain_kqu_kd;
import com.xs.boot.entity.Orgnization_memo;

import java.util.ArrayList;
import java.util.List;

public interface IKaoBanService {
    List<Certain_exam_examArea> find_exam(Certain_exam_examArea kqu_id);
    List<Certain_kqu_kd> find_kqu_kd(Certain_kqu_kd certain_kqu_kd);
    void addCapacity(Certain_exam_examArea certain_exam_examArea);
    void alterCertainKquKd(Certain_kqu_kd certain_kqu_kd);
    Orgnization_memo find_exam2(Orgnization_memo kqu_id);
    void addOrganizationMemo(Orgnization_memo certain_exam_examArea);
}
