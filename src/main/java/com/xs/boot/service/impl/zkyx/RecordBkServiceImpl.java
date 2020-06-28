package com.xs.boot.service.impl.zkyx;

import com.xs.boot.dao.zkyx.RecordBkMapper;
import com.xs.boot.entity.zkyx.RecordBk;
import com.xs.boot.service.zkyx.RecordBkService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordBkServiceImpl implements RecordBkService {

    @Resource
    private RecordBkMapper recordBkMapper;

    @Transactional
    @Override
    public int count(RecordBk x) {
        return recordBkMapper.count(x);
    }

    @Transactional
    @Override
    public int count1(RecordBk x) {
        return recordBkMapper.count1(x);
    }

    @Transactional
    @Override
    public List<RecordBk> get_list(RecordBk x) {
        return recordBkMapper.get_list(x);
    }

    @Transactional
    @Override
    public void alt_bk(RecordBk x) {
        recordBkMapper.alter_kd(x);
    }


}
