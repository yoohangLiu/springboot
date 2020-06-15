package com.xs.boot.service;

import com.xs.boot.entity.User;

public interface IUserService {
    public void insert(User user);
    public void update(User user);
    public User findById(int id);
    public void deleteById(int id);
}
