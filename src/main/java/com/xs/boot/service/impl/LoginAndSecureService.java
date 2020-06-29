package com.xs.boot.service.impl;

import com.xs.boot.dao.util.LoginAndSecureMapper;
import com.xs.boot.entity.util.UserEntity;
import com.xs.boot.service.ILoginAndSecureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginAndSecureService implements ILoginAndSecureService{
    @Resource
    private LoginAndSecureMapper loginAndSecureMapper;

    @Override
    public UserEntity findUserByAccount(UserEntity userEntity){
        return loginAndSecureMapper.findUserByAccount(userEntity);
    }

    @Override
    public UserEntity findUserByAccountOnly(UserEntity userEntity){
        return loginAndSecureMapper.findUserByAccountOnly(userEntity);
    }

}
