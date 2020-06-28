package com.xs.boot.dao;

import com.xs.boot.entity.Judge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by DELL on 2020/6/23.
 */
@Mapper
public interface JudgeMapper {
    public List<Judge> getjudgeList();
    public List<Judge> getschoolList();
    public void addJudge(Judge judge);
}
