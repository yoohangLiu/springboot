package com.xs.boot.dao.kaosheng;

import com.xs.boot.entity.kaosheng.DistrictEntity;
import com.xs.boot.entity.kaosheng.MajorEntity;
import com.xs.boot.entity.kaosheng.StudentInfoEntity;
import com.xs.boot.entity.kaosheng.ZhuKaoSchoolEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by FF on 2020/6/22.
 */
@Mapper
public interface PersonalRegistMapper {
    public int insert(StudentInfoEntity studentInfoEntity);
    public List<MajorEntity> getAllMajors();
    public List<DistrictEntity> getAllCities();
    public List<DistrictEntity> getAllDistricts(String cityCode);
    public List<ZhuKaoSchoolEntity> getAllZhuKaoSchools();
    public int updateStudentInfo(StudentInfoEntity studentInfoEntity);
}
