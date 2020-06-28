package com.xs.boot.dao.zkyx;

import com.xs.boot.entity.zkyx.Group_register;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroupRegisterMapper {
    public void insert(Group_register group_register);
}