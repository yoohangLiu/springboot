package com.xs.boot.dao.zkyx;


import com.xs.boot.entity.zkyx.skVio;
import com.xs.boot.entity.zkyx.skViolist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface skVioMapper {
    public List<skVio> findAll();
    public List<skViolist> findpostAll();
    public void addPost(skViolist violist);
    public skViolist findPostNeed();
    public void deleteVio(int violation_id);
    public void modifyVio(int violation_id);
}