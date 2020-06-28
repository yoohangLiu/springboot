package com.xs.boot.service.zkyx;

import com.xs.boot.entity.zkyx.RecordBk;

import java.util.List;

public interface RecordBkService {
    public int count(RecordBk x);
    public int count1(RecordBk x);
    public List<RecordBk> get_list(RecordBk x);
    public void alt_bk(RecordBk x);
}
