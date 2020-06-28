package com.xs.boot.dao;

import com.xs.boot.entity.OutData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by DELL on 2020/6/24.
 */
@Mapper
public interface OutMapper {
    public List<OutData> getList(OutData outData);
    public List<OutData> getExam();
}
