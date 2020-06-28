package com.xs.boot.dao.util;

import com.xs.boot.entity.util.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginAndSecureMapper {
    public UserEntity findUserByAccount(UserEntity userEntity);
    public UserEntity findUserByAccountOnly(UserEntity userEntity);
}
