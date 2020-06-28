package com.xs.boot.dao.zkyx;

import com.xs.boot.entity.zkyx.Group_signup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroupSignUpMapper {
    public void insert(Group_signup group_signup);
}