package com.xs.boot.service;

import com.xs.boot.entity.OutData;

import java.util.List;

/**
 * Created by DELL on 2020/6/24.
 */
public interface IOutService {
    public List<OutData> getList(OutData outData);
    public List<OutData> getExam();
}
