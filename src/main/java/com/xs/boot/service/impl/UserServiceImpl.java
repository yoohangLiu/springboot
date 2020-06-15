package com.xs.boot.service.impl;

import com.xs.boot.dao.UserMapper;
import com.xs.boot.entity.User;
import com.xs.boot.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Transactional
    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Transactional
    public void update(User user) {
        userMapper.update(user);
    }

    @Transactional
    public User findById(int id) {
        User user = userMapper.findById(id);
        return user;
    }

    @Transactional
    public void deleteById(int id) {
        userMapper.deleteById(id);
    }
}
