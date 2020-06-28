package com.xs.boot.service.zkyx;

//import com.xs.boot.entity.Exam;
import com.xs.boot.entity.zkyx.ExamPoint;

import java.util.List;

public interface ExamPointService {
    public void insert(ExamPoint examPoint);
    public void delete(ExamPoint examPoint);
    public int count_cap(ExamPoint examPoint);
    public List<ExamPoint> get_list(ExamPoint examPoint);
}
