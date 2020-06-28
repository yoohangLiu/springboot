package com.xs.boot.dao.zkyx;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ImportGroupRegisterMapper {
    //查询数据
    @Select("SELECT * FROM student_info WHERE zkao_num = #{zkaoNum}")
    ImportGroupRegisterMapper findUserByzkaoNum(@Param("zkao_num") String zkaoNum);
    //添加数据
    @Insert("INSERT INTO USER(zkao_num, stu_name，zj_num) VALUES( #{zkaoNum}, #{stuName},#{zjNum})")
    int insert(@Param("zkaoNum") String zkaoNum, @Param("stuName") int stuName, @Param("zjNum") String zjNum);
}
