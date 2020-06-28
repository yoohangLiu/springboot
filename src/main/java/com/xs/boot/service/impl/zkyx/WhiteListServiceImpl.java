package com.xs.boot.service.impl.zkyx;

import com.xs.boot.dao.zkyx.WhiteListMapper;
import com.xs.boot.entity.zkyx.WhiteList;
import com.xs.boot.service.zkyx.IWhiteListService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class WhiteListServiceImpl implements IWhiteListService {
    @Resource
    private WhiteListMapper whiteListMapper;

    @Transactional
    @Override
    public void insert(WhiteList whiteList){
        whiteListMapper.insert(whiteList);
    }

    @Transactional
    @Override
    public void delete(WhiteList whiteList){
        whiteListMapper.delete(whiteList);
    }

//    @Override
//    public void insertByMap(Map<String, String> map) {
//
//    }
}
