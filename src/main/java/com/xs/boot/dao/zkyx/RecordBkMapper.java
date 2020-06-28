package com.xs.boot.dao.zkyx;

import com.xs.boot.entity.zkyx.RecordBk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordBkMapper {
    public int count(RecordBk x);
    public int count1(RecordBk x);
    public List<RecordBk> get_list(RecordBk x);
    public void alter_kd(RecordBk x);
}
