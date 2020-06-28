package com.xs.boot.dao.kaosheng;

import com.xs.boot.entity.kaosheng.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by FF on 2020/6/22.
 */
@Mapper
public interface KaoShengMapper {
    // 个人报名
    public int insert(StudentInfoEntity studentInfoEntity);

    public List<MajorEntity> getAllMajors();

    public List<DistrictEntity> getAllCities();

    public List<DistrictEntity> getAllDistricts(String cityCode);

    public List<ZhuKaoSchoolEntity> getAllZhuKaoSchools();

    public int updateStudentInfo(StudentInfoEntity studentInfoEntity);

    // 个人报考
    public int insertBk(StudentBkEntity studentBkEntity);

    public int updateStudentBmState(StudentInfoEntity studentInfoEntity);

    public StudentInfo4SelectEntity getStudentInfoLimitByZj(String zj_num);

    public List<ExamEntity> getExamsLimitByTime(String time_now);

    public List<CourseEntity> getCoursesLimitByMajor(String major_name);

    public List<ExamKquEntity> getKaoQuLimitByExam(ExamEntity examEntity);

    public DistrictEntity getKaoQuNameLimitByKquId(ExamKquEntity examKquEntity);

    public List<ZhuKaoSchoolEntity> getZhuKaoSchoolsLimitByMajor(String major_name);

    // 个人缴费
    public List<CourseEntity> getCoursesLimitByStuBk(String student_id);
    public int updateStudentBKPayState(StudentBkEntity studentBkEntity);

    // 打印座位通知单
    public List<SeatArrangeEntity> getSeatArrangeLimitByZKaoNum(SeatArrangeEntity seatArrangeEntity);
    public StudentBkEntity getStudentBkLimitByStuIdAndCourseId(SeatArrangeEntity seatArrangeEntity);

    public List<SeatDetailsEntity> getSeatDetailsByStuId(SeatLimitParamsEntity seatLimitParamsEntity);

}
