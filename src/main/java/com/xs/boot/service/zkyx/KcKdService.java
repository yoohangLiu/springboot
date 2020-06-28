package com.xs.boot.service.zkyx;


import com.xs.boot.entity.zkyx.KcKd;

public interface KcKdService {
    public void insert(KcKd kcKd);
    public void delete(KcKd kcKd);
    public int count(KcKd kcKd);
    public void English_insert(KcKd kcKd);
    public void English_delete(KcKd kcKd);
}
