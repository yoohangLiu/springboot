package com.xs.boot.dao;

import com.xs.boot.entity.Vio;
import com.xs.boot.entity.Violist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by DELL on 2020/6/19.
 */
@Mapper
public interface VioMapper {
    public List<Vio> findAll();
    public List<Violist> findpostAll();
    public void addVio(Vio vio);
    public void deleteVio(int violation_id);
    public void modifyVio(int violation_id);
}
