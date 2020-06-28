package com.xs.boot.service;



import com.xs.boot.entity.myKaoban.*;

import java.util.List;

public interface IKaoBanService {
    List<Certain_exam_examArea> find_exam(Certain_exam_examArea kqu_id);
    List<Certain_kqu_kd> find_kqu_kd(Certain_kqu_kd certain_kqu_kd);
    void addCapacity(Certain_exam_examArea certain_exam_examArea);
    void alterCertainKquKd(Certain_kqu_kd certain_kqu_kd);
    Orgnization_memo find_exam2(Orgnization_memo kqu_id);
    void addOrganizationMemo(Orgnization_memo certain_exam_examArea);
    List<Lingjuan_list> find_tongkao(Lingjuan_list kqu_id);
    Lingjuan_list find_Lingjuan(Lingjuan_list kqu_id);
    void addLingjuanList(Lingjuan_list certain_exam_examArea);
    List<Violist> find_vioList(Violist kqu_id);
    void addViolationList(Violist certain_exam_examArea);
    List<Kd_info> find_total_kd();
    Kd_info find_max_kd_id();
    void addKd_info(Kd_info certain_exam_examArea);

    void delete_kd_info(Kd_info certain_exam_examArea);
    List<Certain_kqu_kd> find_exam3(Certain_kqu_kd kqu_id);

    void alterCertainKquKd2(Certain_kqu_kd certain_kqu_kd);

    void insert_certain_kqu_kd(Certain_kqu_kd certain_kqu_kd);

    List<Certain_exam_examArea> find_shizhou_certain_area(Certain_exam_examArea kqu_id);

    void insert_Certain_Kqu(Certain_exam_examArea certain_kqu_kd);

    List<StudentInfo> find_student_info(StudentInfo certain_kqu_kd);

    void alterOneState(StudentInfo certain_kqu_kd);

    void alterAllState(StudentInfo certain_kqu_kd);

    List<Certain_exam_examArea> select_bk_student_num(Certain_exam_examArea kqu_id);

    List<Certain_kqu_kd> select_kaochang_spec_and_num(Certain_kqu_kd kqu_id);
}
