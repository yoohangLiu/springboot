package com.xs.boot.dao;

import com.xs.boot.entity.Paper;
import com.xs.boot.entity.Sche;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatMapper {
    List<Paper> paper_query(Paper paper);
    List<Sche> sche_query(Sche sche);
    List<Paper> kd_paper_query(Paper paper);
}
