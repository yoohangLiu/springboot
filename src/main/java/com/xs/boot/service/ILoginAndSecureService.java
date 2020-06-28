package com.xs.boot.service;

import com.xs.boot.entity.kaosheng.*;
import com.xs.boot.entity.util.UserEntity;

import java.util.List;

public interface ILoginAndSecureService {
    public UserEntity findUserByAccount(UserEntity userEntity);
    public UserEntity findUserByAccountOnly(UserEntity userEntity);

}
