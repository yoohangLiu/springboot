package com.xs.boot.service;



import com.xs.boot.entity.Certain_kqu_kd;

import java.util.ArrayList;
import java.util.List;

public interface IKaoBanService {
    List<Certain_kqu_kd> find_kqu_kd(Certain_kqu_kd certain_kqu_kd);
    void addKaoChangRongLiang( int num);
}
