package com.xs.boot.service.impl;

import com.xs.boot.dao.OutMapper;
import com.xs.boot.entity.OutData;
import com.xs.boot.service.IOutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by DELL on 2020/6/24.
 */
@Service
public class OutService implements IOutService {

    @Resource
    private OutMapper outMapper;


    @Override
    public List<OutData> getList(OutData outData){
           return outMapper.getList(outData);
    }
    @Override
    public List<OutData> getExam(){
        return outMapper.getExam();
    }
}
