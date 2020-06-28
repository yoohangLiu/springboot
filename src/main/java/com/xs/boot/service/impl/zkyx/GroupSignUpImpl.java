package com.xs.boot.service.impl.zkyx;

import com.xs.boot.dao.zkyx.GroupSignUpMapper;
import com.xs.boot.entity.zkyx.Group_signup;
import com.xs.boot.service.zkyx.IGroupSignUpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class GroupSignUpImpl implements IGroupSignUpService {
    @Resource
    private GroupSignUpMapper groupsignupMapper;

    @Transactional
    @Override
    public void insert(Group_signup group_signup){
        groupsignupMapper.insert(group_signup);
    }


//    @Override
//    public void insertByMap(Map<String, String> map) {
//
//    }
}