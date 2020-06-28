package com.xs.boot.dao;

import com.xs.boot.entity.Kb_zkz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Kb_zkzMapper {
    public List<Kb_zkz> getList1(Kb_zkz kb_zkz);
    public List<Kb_zkz> getList2(Kb_zkz kb_zkz);
    public List<Kb_zkz> getExam();
}
