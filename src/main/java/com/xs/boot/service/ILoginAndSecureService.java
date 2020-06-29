package com.xs.boot.service;

import com.xs.boot.entity.util.UserEntity;

public interface ILoginAndSecureService {
    public UserEntity findUserByAccount(UserEntity userEntity);
    public UserEntity findUserByAccountOnly(UserEntity userEntity);

}
