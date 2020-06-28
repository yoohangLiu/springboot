package com.xs.boot.service.zkyx;

import com.xs.boot.entity.zkyx.skVio;
import com.xs.boot.entity.zkyx.skViolist;

import java.util.List;

public interface skIVioService {
    public List<skVio> findAll();
    public List<skViolist> findpostAll();
    public skViolist findPostNeed();
    public void addPost(skViolist violist);
    public void deleteVio(int violation_id);
    public void modifyVio(int violation_id);
}
