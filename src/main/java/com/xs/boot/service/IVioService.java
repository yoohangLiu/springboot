package com.xs.boot.service;

import com.xs.boot.entity.Vio;
import com.xs.boot.entity.Violist;

import java.util.List;

/**
 * Created by DELL on 2020/6/19.
 */
public interface IVioService {
    public List<Vio> findAll();
    public List<Violist> findpostAll();
    public void addVio(Vio vio);
    public void deleteVio(int violation_id);
    public void modifyVio(int violation_id);
}
