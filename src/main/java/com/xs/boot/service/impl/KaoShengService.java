package com.xs.boot.service.impl;

import com.xs.boot.dao.kaosheng.KaoShengMapper;
import com.xs.boot.dao.kaosheng.PersonalRegistMapper;
import com.xs.boot.entity.kaosheng.*;
import com.xs.boot.service.IKaoShengService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class KaoShengService implements IKaoShengService{
    @Resource
    private PersonalRegistMapper personalRegistMapper;
    @Resource
    private KaoShengMapper kaoShengMapper;

    // 个人报名
    @Override
    @Transactional
    public int insert(StudentInfoEntity studentInfoEntity) {
        return personalRegistMapper.insert(studentInfoEntity);
    }

    @Override
    public List<MajorEntity> getAllMajors() {
        return personalRegistMapper.getAllMajors();
    }

    @Override
    public List<DistrictEntity> getAllCities() {
        return personalRegistMapper.getAllCities();
    }

    @Override
    public List<DistrictEntity> getAllDistricts(String cityCode) {
        return personalRegistMapper.getAllDistricts(cityCode);
    }

    @Override
    public List<ZhuKaoSchoolEntity> getAllZhuKaoSchools() {
        return personalRegistMapper.getAllZhuKaoSchools();
    }

    @Override
    @Transactional
    public int updateStudentInfo(StudentInfoEntity studentInfoEntity){
        return personalRegistMapper.updateStudentInfo(studentInfoEntity);
    }


    // 个人报考
    @Override
    @Transactional
    public int insertBk(StudentBkEntity studentBkEntity) {
        return kaoShengMapper.insertBk(studentBkEntity);
    }

    @Override
    @Transactional
    public int updateStudentBmState(StudentInfoEntity studentInfoEntity) {
        return kaoShengMapper.updateStudentBmState(studentInfoEntity);
    }

    @Override
    public StudentInfo4SelectEntity getStudentInfoLimitByZj(String zj_num) {
        return kaoShengMapper.getStudentInfoLimitByZj(zj_num);
    }

    @Override
    public List<ExamEntity> getExamsLimitByTime(String time_now) {
        return kaoShengMapper.getExamsLimitByTime(time_now);
    }

    @Override
    public List<CourseEntity> getCoursesLimitByMajor(String major_name) {
        return kaoShengMapper.getCoursesLimitByMajor(major_name);
    }

    @Override
    public List<ExamKquEntity> getKaoQuLimitByExam(ExamEntity examEntity) {
        return kaoShengMapper.getKaoQuLimitByExam(examEntity);
    }

    @Override
    public DistrictEntity getKaoQuNameLimitByKquId(ExamKquEntity examKquEntity) {
        return kaoShengMapper.getKaoQuNameLimitByKquId(examKquEntity);
    }

    @Override
    public List<ZhuKaoSchoolEntity> getZhuKaoSchoolsLimitByMajor(String major_name) {
        return kaoShengMapper.getZhuKaoSchoolsLimitByMajor(major_name);
    }

    // 个人缴费
    @Override
    public List<CourseEntity> getCoursesLimitByStuBk(String student_id){
        return kaoShengMapper.getCoursesLimitByStuBk(student_id);
    }

    @Override
    @Transactional
    public int updateStudentBKPayState(StudentBkEntity studentBkEntity){
        return kaoShengMapper.updateStudentBKPayState(studentBkEntity);
    }

    // 打印座位通知单
    @Override
    public List<SeatArrangeEntity> getSeatArrangeLimitByZKaoNum(SeatArrangeEntity seatArrangeEntity){
        return kaoShengMapper.getSeatArrangeLimitByZKaoNum(seatArrangeEntity);
    }

    @Override
    public StudentBkEntity getStudentBkLimitByStuIdAndCourseId(SeatArrangeEntity seatArrangeEntity){
        return kaoShengMapper.getStudentBkLimitByStuIdAndCourseId(seatArrangeEntity);
    }

    @Override
    public List<SeatDetailsEntity> getSeatDetailsByStuId(SeatLimitParamsEntity seatLimitParamsEntity){
        return kaoShengMapper.getSeatDetailsByStuId(seatLimitParamsEntity);
    }

}
