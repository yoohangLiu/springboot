package com.xs.boot.dao;

import com.xs.boot.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public void insert(User user);
    public void update(User user);
    public User findById(int id);
    public void deleteById(int id);
}
