package com.xs.boot.service;

import com.xs.boot.entity.Paper;
import com.xs.boot.entity.Sche;

import java.util.List;

/**
 * Created by asus on 2020/6/24.
 */
public interface IStatService {
    List<Paper> paper_query(Paper paper);
    List<Sche> sche_query(Sche sche);
    List<Paper> kd_paper_query(Paper paper);
}
