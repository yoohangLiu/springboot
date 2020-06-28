package com.xs.boot.service.zkyx;

import com.xs.boot.entity.zkyx.WhiteList;


public interface IWhiteListService {
    public void insert(WhiteList x);
    public void delete(WhiteList x);
//    public void insertByMap(Map<String,String> map);
}
