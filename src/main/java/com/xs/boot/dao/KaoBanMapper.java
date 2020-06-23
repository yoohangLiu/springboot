package com.xs.boot.dao;

import com.xs.boot.entity.Certain_kqu_kd;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface KaoBanMapper {
    List<Certain_kqu_kd> find_kqu_kd(Certain_kqu_kd certain_kqu_kd);
    void insertKaoChangRongLiang( int num);
}
