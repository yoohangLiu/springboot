package com.xs.boot.service.impl.zkyx;

import com.xs.boot.dao.zkyx.ExamPointMapper;
import com.xs.boot.entity.zkyx.ExamPoint;
import com.xs.boot.service.zkyx.ExamPointService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExamPointServiceImpl implements ExamPointService {

    @Resource
    private ExamPointMapper examPointMapper;

    @Transactional
    @Override
    public void insert(ExamPoint examPoint) {
        examPointMapper.insert(examPoint);
    }

    @Transactional
    @Override
    public void delete(ExamPoint examPoint) {
        examPointMapper.delete(examPoint);
    }

    @Transactional
    @Override
    public int count_cap(ExamPoint examPoint) {
        if(examPointMapper.count(examPoint) == 0)
            return 0;
        else
            return examPointMapper.count_cap(examPoint);
    }

    @Transactional
    @Override
    public List<ExamPoint> get_list(ExamPoint examPoint) {
        return examPointMapper.get_list(examPoint);
    }


}
