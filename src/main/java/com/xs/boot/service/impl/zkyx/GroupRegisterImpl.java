package com.xs.boot.service.impl.zkyx;

import com.xs.boot.dao.zkyx.GroupRegisterMapper;
import com.xs.boot.entity.zkyx.Group_register;
import com.xs.boot.service.zkyx.IGroupRegisterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class GroupRegisterImpl implements IGroupRegisterService {
    @Resource
    private GroupRegisterMapper groupregisterMapper;

    @Transactional
    @Override
    public void insert(Group_register group_register){
        groupregisterMapper.insert(group_register);
    }


//    @Override
//    public void insertByMap(Map<String, String> map) {
//
//    }
}