package com.xs.boot.dao.zkyx;


import com.xs.boot.entity.zkyx.KcKd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface KcKdMapper {
    public void insert(KcKd kcKd);
    public void delete(KcKd kcKd);
    public int count(KcKd kcKd);
    public int chk(KcKd kcKd);
    public void English_insert(KcKd kcKd);
    public void English_delete(KcKd kcKd);
}
