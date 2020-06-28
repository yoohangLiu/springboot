package com.xs.boot.service.impl;
import com.xs.boot.dao.Kb_zkzMapper;
import com.xs.boot.entity.Kb_zkz;
import com.xs.boot.service.Kb_zkzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Kb_zkzServiceImpl implements Kb_zkzService {
    @Resource
    private Kb_zkzMapper kb_zkzMapper;

    @Override
    public List<Kb_zkz> getList1(Kb_zkz kb_zkz){ return kb_zkzMapper.getList1(kb_zkz);}
    public List<Kb_zkz> getList2(Kb_zkz kb_zkz){ return kb_zkzMapper.getList2(kb_zkz);}
    public List<Kb_zkz> getExam(){return kb_zkzMapper.getExam();}
}
