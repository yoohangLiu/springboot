package com.xs.boot.dao.zkyx;

import com.xs.boot.entity.zkyx.Other;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OtherMapper {
    public void insert(Other other);
}
