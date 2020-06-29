package com.xs.boot.controller.kaosheng;

import com.xs.boot.entity.kaosheng.*;
import com.xs.boot.entity.util.UserEntity;
import com.xs.boot.service.impl.KaoShengService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by FF on 2020/6/22.
 */
@Controller
@RequestMapping("/kaosheng")
public class KaoShengController {
    @Autowired
    private KaoShengService kaoShengService;

    @RequestMapping("/goto-personal-regist")
    public String gotoPersonalRegist() {
        return "kaosheng/personal-regist";
    }


    @RequestMapping(value = "/personal-regist", method = RequestMethod.POST)
    @ResponseBody
    //返回动态构造的json数据
    public String personalRegist(@RequestBody StudentInfoEntity studentInfoEntity) {
        System.out.println("前端传入的数据：" + studentInfoEntity);
        studentInfoEntity.setStuImg("../../static/dist/img/user1-128x128.jpg");
        int flag = kaoShengService.insert(studentInfoEntity);
        //System.out.println("插入标志："+flag);

        //构建准考证
        String szNum = studentInfoEntity.getSzNum();
        String qxNum = studentInfoEntity.getQxNum();
        //当前时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateNow = sdf.format(date);
        //System.out.println("当前时间为: " + dateNow);
        String year = dateNow.substring(2, 4);
        int numThisYear = 1;
        String studentId = studentInfoEntity.getStudentId() + "";
        if (studentId.length() != 5) {
            int makeUpLength = 5 - studentId.length();
            for (int i = 0; i < makeUpLength; i++) {
                studentId = "0" + studentId;
            }
        }
        String zkaoNum = szNum + qxNum + year + numThisYear + studentId;
        //System.out.println("准考证："+zkaoNum);
        //设置准考证号
        studentInfoEntity.setZkaoNum(zkaoNum);

        //设置考生状态
        studentInfoEntity.setBmState(0);

        //设置操作时间
        studentInfoEntity.setOpTime(dateNow);

        //更新数据库
        if (flag > 0) {
            //System.out.println("更新前:"+studentInfoEntity);
            flag = kaoShengService.updateStudentInfo(studentInfoEntity);
            //System.out.println("更新标志："+flag);
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        List<StudentInfoEntity> studentInfoEntityList = new ArrayList<>();
        studentInfoEntityList.add(studentInfoEntity);
        jsonObject.put("data", studentInfoEntityList);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/getAllMajors", method = RequestMethod.GET)
    @ResponseBody
    public String getAllMajors() {
        List<MajorEntity> majorEntityList = kaoShengService.getAllMajors();

        int flag = 0;
        if (majorEntityList.size() > 0) {
            flag = 1;
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", majorEntityList);
        //System.out.println(jsonObject);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/getAllCities", method = RequestMethod.GET)
    @ResponseBody
    public String getAllCities() {
        List<DistrictEntity> districtEntityList = kaoShengService.getAllCities();

        int flag = 0;
        if (districtEntityList.size() > 0) {
            flag = 1;
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", districtEntityList);
        //System.out.println(jsonObject);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/getAllDistricts/{cityCode}", method = RequestMethod.POST)
    @ResponseBody
    public String getAllDistricts(@PathVariable("cityCode") String cityCode) {
        //System.out.println("输出citycode:" + cityCode);
        List<DistrictEntity> districtEntityList = kaoShengService.getAllDistricts(cityCode);

        int flag = 0;
        if (districtEntityList.size() > 0) {
            flag = 1;
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", districtEntityList);
        //System.out.println(jsonObject);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/getAllZhuKaoSchools", method = RequestMethod.GET)
    @ResponseBody
    public String getAllZhuKaoSchools() {
        List<ZhuKaoSchoolEntity> zhuKaoSchoolEntityList = kaoShengService.getAllZhuKaoSchools();

        int flag = 0;
        if (zhuKaoSchoolEntityList.size() > 0) {
            flag = 1;
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", zhuKaoSchoolEntityList);
        //System.out.println(jsonObject);
        return jsonObject.toString();
    }

    // 个人报考

    @RequestMapping("/goto-personal-bk")
    public String gotoPersonalBk() {
        return "kaosheng/personal-bk";
    }

    @RequestMapping(value = "/insertBk")
    @ResponseBody
    public String insertBk(@RequestBody StudentBkEntity studentBkEntity) {
        //System.out.println("前端传studentBkEntity: "+studentBkEntity);

        // 获取现在时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateNow = sdf.format(date);
        studentBkEntity.setOp_time(dateNow);
        int flag = kaoShengService.insertBk(studentBkEntity);
        if (flag > 0){
            //更新报名状态为2
            StudentInfoEntity studentInfoEntity = new StudentInfoEntity();
            studentInfoEntity.setStudentId(studentBkEntity.getStudent_id());
            studentInfoEntity.setBmState(2);
            flag = kaoShengService.updateStudentBmState(studentInfoEntity);
        }

        List<StudentBkEntity> studentBkEntityList = new ArrayList<>();
        studentBkEntityList.add(studentBkEntity);
        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", studentBkEntityList);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/getStudentInfoLimitByZj/{zj_num}")
    @ResponseBody
    public String getStudentInfoLimitByZj(@PathVariable("zj_num") String zj_num, HttpSession session) {
        // 覆盖掉前端传入的假的证件号码
        UserEntity user = (UserEntity)session.getAttribute("user");
        zj_num = user.getAccount();

        StudentInfo4SelectEntity studentInfo4SelectEntity = kaoShengService.getStudentInfoLimitByZj(zj_num);
        List<StudentInfo4SelectEntity> studentInfoEntityList = new ArrayList<>();
        if (studentInfo4SelectEntity != null){
            studentInfoEntityList.add(studentInfo4SelectEntity);
        }

        int flag = 0;
        if (studentInfoEntityList.size() > 0) {
            flag = 1;
        }
        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", studentInfoEntityList);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/getExamsLimitByTime")
    @ResponseBody
    public String getExamsLimitByTime() {
        // 获取现在时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateNow = sdf.format(date);
        // 查询
        List<ExamEntity> examEntityList = kaoShengService.getExamsLimitByTime(dateNow);
        int flag = 0;
        if (examEntityList.size() > 0) {
            flag = 1;
        }
        // 返回
        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", examEntityList);
        return jsonObject.toString();
    }

    // 通过专业名限制选择的课程
    @RequestMapping(value = "/getCoursesLimitByMajor")
    @ResponseBody
    public String getCoursesLimitByMajor(String major_name) {
        //System.out.println("major_name:" + major_name);
        List<CourseEntity> courseEntityList = kaoShengService.getCoursesLimitByMajor(major_name);
        int flag = 0;
        if (courseEntityList.size() > 0) {
            flag = 1;
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", courseEntityList);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/getKaoQuLimitByExam")
    @ResponseBody
    public String getKaoQuLimitByExam(@RequestBody ExamEntity examEntity) {
        //System.out.println("从前端获取到的examEntity:"+examEntity);
        List<ExamKquEntity> list = kaoShengService.getKaoQuLimitByExam(examEntity);
        int flag = 0;
        if (list.size() > 0) {
            flag = 1;
        }
        //System.out.println("查询到的考区列表:"+list);
        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", list);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/getKaoQuNameLimitByKquId")
    @ResponseBody
    public String getKaoQuNameLimitByKquId(String[] kqu_list) {
        ExamKquEntity examKquEntity = new ExamKquEntity();
        List kqu_name_list = new ArrayList<>();
        for (String kqu:kqu_list) {
            //System.out.println("从前端获取到的kqu_list:" + kqu);
            String city_code = kqu.substring(0, 2);
            String district_code = kqu.substring(2);
            //System.out.println(city_code+" "+district_code);
            examKquEntity.setCity_code(city_code);
            examKquEntity.setDistrict_code(district_code);
            DistrictEntity districtEntity = kaoShengService.getKaoQuNameLimitByKquId(examKquEntity);
            //删除重名考区【实际不太合理】
            if (kqu_name_list.indexOf(districtEntity.getKqu_name())==-1){
                kqu_name_list.add(districtEntity.getKqu_name());
            }
        }

        int flag = 0;
        if (kqu_name_list.size() > 0){
            flag = 1;
        }
        //System.out.println("查询到的考区名列表:"+kqu_list.toString());
        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", kqu_name_list);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/getZhuKaoSchoolsLimitByMajor")
    @ResponseBody
    public String getZhuKaoSchoolsLimitByMajor(String major_name) {
        List<ZhuKaoSchoolEntity> zhuKaoSchoolEntityList = kaoShengService.getZhuKaoSchoolsLimitByMajor(major_name);
        int flag = 0;
        if (zhuKaoSchoolEntityList.size() > 0) {
            flag = 1;
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", zhuKaoSchoolEntityList);
        return jsonObject.toString();
    }

    //个人缴费

    @RequestMapping("/goto-personal-pay")
    public String gotoPersonalPay() {
        return "kaosheng/personal-pay";
    }

    // 通过学生id限制选择的课程
    @RequestMapping(value = "/getCoursesLimitByStuBk")
    @ResponseBody
    public String getCoursesLimitByStuBk(String student_id) {
        System.out.println("student_id:" + student_id);
        List<CourseEntity> courseEntityList = kaoShengService.getCoursesLimitByStuBk(student_id);
        int flag = 0;
        if (courseEntityList.size() > 0) {
            flag = 1;
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", courseEntityList);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/updateStudentBKPayState")
    @ResponseBody
    public String updateStudentBKPayState(@RequestBody StudentBkEntity studentBkEntity) {
        System.out.println("前端传studentBkEntity: "+studentBkEntity);

        //更新报名状态为2
        studentBkEntity.setPay_state(1);
        int flag = kaoShengService.updateStudentBKPayState(studentBkEntity);

        List<StudentBkEntity> studentBkEntityList = new ArrayList<>();
        studentBkEntityList.add(studentBkEntity);

        // 检查是否完成所有课程缴费：缴费完成 状态设置3 未完成设置为2
        List<CourseEntity> courseEntityList = kaoShengService.getCoursesLimitByStuBk(studentBkEntity.getStudent_id()+"");
        int coursesNeedPay = 0;
        for (int i =0 ; i < courseEntityList.size(); i++){
            if (courseEntityList.get(i).getPay_state() == 0){
                coursesNeedPay += 1;
            }
        }
        if(coursesNeedPay == 0){
            //更新报名状态为3
            StudentInfoEntity studentInfoEntity = new StudentInfoEntity();
            studentInfoEntity.setStudentId(studentBkEntity.getStudent_id());
            studentInfoEntity.setBmState(3);
            flag = kaoShengService.updateStudentBmState(studentInfoEntity);
        }else {
            //存在未交费课程，更新报名状态为 2
            StudentInfoEntity studentInfoEntity = new StudentInfoEntity();
            studentInfoEntity.setStudentId(studentBkEntity.getStudent_id());
            studentInfoEntity.setBmState(2);
            flag = kaoShengService.updateStudentBmState(studentInfoEntity);
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", studentBkEntityList);
        return jsonObject.toString();
    }

    //个人进度查看

    @RequestMapping("/goto-personal-state-check")
    public String gotoPersonalStateCheck() {
        return "kaosheng/personal-state-check";
    }

    //打印座位通知单

    @RequestMapping("/goto-personal-seat-print")
    public String gotoSeatPrint() {
        return "kaosheng/personal-seat-print";
    }

    // 通过准考证选择座位记录
    @RequestMapping(value = "/getSeatArrangeLimitByZKaoNum")
    @ResponseBody
    public String getSeatArrangeLimitByZKaoNum(@RequestBody SeatArrangeEntity seatArrangeEntity) {
        System.out.println("前端传入 seatArrangeEntity:" + seatArrangeEntity);

        // 1. 查询type_name kc_code
        StudentBkEntity studentBkEntity = kaoShengService.getStudentBkLimitByStuIdAndCourseId(seatArrangeEntity);
        System.out.println("查到的studentBkEntity:" + studentBkEntity);
        seatArrangeEntity.setKc_code(studentBkEntity.getKc_code());
        seatArrangeEntity.setType_name(studentBkEntity.getType_name());

        // 2. 查询座位通知单
        List<SeatArrangeEntity> seatArrangeEntityList = kaoShengService.getSeatArrangeLimitByZKaoNum(seatArrangeEntity);


        // 3. 设置考试类型名字
        int typeNameId = seatArrangeEntity.getType_name();
        String typeName = "统考";
        //统考、省考、英语听说、毕业论文、实践性环节
        if (typeNameId == 1){
            typeName = "统考";
        }else if (typeNameId == 2){
            typeName = "省考";
        }else if (typeNameId == 3){
            typeName = "英语听说";
        }else if (typeNameId == 4){
            typeName = "毕业论文";
        }else if (typeNameId == 5){
            typeName = "实践性环节";
        }
        seatArrangeEntity.setExam_type_name(typeName);
        System.out.println("修改1 seatArrangeEntity:" + seatArrangeEntity);
        System.out.println("数据库 seatArrangeEntity:" + seatArrangeEntityList.get(0));

        // 4. 设置列表每个元素的kqu_name

        // 5. 设置列表每个元素的kd_name

        // 6. 设置列表每个元素的thorough_address

        // 7. 设置列表每个元素时间: 根据 kc_code + type_name 查 exam 表
        
        // 8. 设置列表每个元素的dy_zw_allowed：根据当前时间
        
        // 9. 列表遍历依次设置前端传回: seatArrangeEntity参数

        int flag = 0;
        if (seatArrangeEntityList.size() > 0) {
            flag = 1;
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", seatArrangeEntityList);
        return jsonObject.toString();
    }

    @RequestMapping(value = "/getSeatDetailsByStuId")
    @ResponseBody
    public String getSeatDetailsByStuId(@RequestBody SeatLimitParamsEntity seatLimitParamsEntity, HttpSession session) {
        System.out.println("前端取座位信息："+seatLimitParamsEntity);
        List<SeatDetailsEntity> seatDetailsEntityList = kaoShengService.getSeatDetailsByStuId(seatLimitParamsEntity);

        // 获取现在时间看设置是否可打印
        //当前时间
        Date dateNow = new Date();
        for (SeatDetailsEntity seatDetailsEntity: seatDetailsEntityList){
            Date dy_s = seatDetailsEntity.getDy_zw_s_time();
            Date dy_e = seatDetailsEntity.getDy_zw_e_time();
            int dy_s_flag = dateNow.compareTo(dy_s);
            int dy_e_flag = dateNow.compareTo(dy_e);
            if (dy_s_flag >=0 && dy_e_flag <=0){
                seatDetailsEntity.setDy_zw_allowed(1);
            }
        }

        int flag = 0;
        if (seatDetailsEntityList.size() > 0) {
            flag = 1;
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("data", seatDetailsEntityList);
        //获取设置的session 测试
        //jsonObject.put("session", session.getAttribute("user"));
        return jsonObject.toString();
    }
}
