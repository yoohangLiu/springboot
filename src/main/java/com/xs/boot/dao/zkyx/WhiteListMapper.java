package com.xs.boot.dao.zkyx;

import com.xs.boot.entity.zkyx.WhiteList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WhiteListMapper {
    public void insert(WhiteList x);
    public void delete(WhiteList x);
}
