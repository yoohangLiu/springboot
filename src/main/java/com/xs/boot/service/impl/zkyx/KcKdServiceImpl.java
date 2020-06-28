package com.xs.boot.service.impl.zkyx;

import com.xs.boot.dao.zkyx.KcKdMapper;
import com.xs.boot.entity.zkyx.KcKd;
import com.xs.boot.service.zkyx.KcKdService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class KcKdServiceImpl implements KcKdService {

    @Resource
    private KcKdMapper kcKdMapper;

    @Transactional
    @Override
    public void insert(KcKd kcKd) {
        kcKdMapper.insert(kcKd);
    }

    @Transactional
    @Override
    public void delete(KcKd kcKd) {
        kcKdMapper.delete(kcKd);
    }

    @Transactional
    @Override
    public int count(KcKd kcKd) {
        if(kcKdMapper.chk(kcKd) == 0)
            return 0;
        else
            return kcKdMapper.count(kcKd);
    }

    @Transactional
    @Override
    public void English_insert(KcKd kcKd) {
        kcKdMapper.English_insert(kcKd);
    }

    @Transactional
    @Override
    public void English_delete(KcKd kcKd) {
        kcKdMapper.English_delete(kcKd);
    }


}
