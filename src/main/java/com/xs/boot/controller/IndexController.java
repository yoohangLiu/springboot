package com.xs.boot.controller;

import com.xs.boot.entity.kaosheng.StudentInfo4SelectEntity;
import com.xs.boot.entity.util.UserEntity;
import com.xs.boot.service.impl.KaoShengService;
import com.xs.boot.service.impl.LoginAndSecureService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private LoginAndSecureService loginAndSecureService;

    @Autowired
    private KaoShengService kaoShengService;

    //跳转到登录
    @RequestMapping(value = "/login")
    public String login(){
        return "util/login";
    }

    //登录检查
    @RequestMapping(value = "/login-check", method = RequestMethod.POST)
    @ResponseBody
    public String findUserByAccount(@RequestBody UserEntity userEntity, HttpSession session) {
        System.out.println("前端用户信息："+userEntity);
        UserEntity userEntityDB;
        int flag = 0;
        String info = "用户名或者密码错误</br>请重新输入!";
        System.out.println("StringUtils检测用户账号是否为空:"+StringUtils.isEmpty(userEntity.getAccount()));
        if(!StringUtils.isEmpty(userEntity.getAccount())){
            //用户输入账号不为空

            //确定用户类型
            UserEntity userEntityToGetUserType =loginAndSecureService.findUserByAccountOnly(userEntity);
            if(userEntityToGetUserType != null){
                //数据库存在该用户
                userEntity.setUser_type(userEntityToGetUserType.getUser_type());

                //检查考生是否报名，如果报名，可直接查询用户表，如果没有过滤掉考生表信息
                int studentBmFlag = 0;
                if (userEntity.getUser_type() == 1){
                    StudentInfo4SelectEntity studentInfo4SelectEntity = kaoShengService.getStudentInfoLimitByZj(userEntity.getAccount());
                    if (studentInfo4SelectEntity != null){
                        //学生已报名
                        studentBmFlag = 1;
                    }else {
                        studentBmFlag = 0;
                        userEntity.setUser_type(-1);
                    }
                }

                userEntityDB = loginAndSecureService.findUserByAccount(userEntity);

                //验证密码
                if(userEntity.getPassword().equals(userEntityDB.getPassword())){
                    flag = 1;
                    info = "登录成功</br>即将进入首页!";
                    //TODO:1.把city_code和district_code拼接起来成kqu_id，并保留 city_code，district_code 两个字段
                    //TODO:2.这三个一起传
                    String kqu_id = userEntityDB.getCity_code()+userEntityDB.getDistrict_code();
                    userEntityDB.setKqu_id(kqu_id);

                    //脱密
                    userEntityDB.setPassword("");

                    //如果考生未报名，设置考试名字为：请报名
                    if (studentBmFlag == 0 && userEntityDB.getUser_type() == 1){
                        userEntityDB.setStu_name("请报名");
                        userEntityDB.setStu_img("../../static/dist/img/notbm1.png");
                    }

                    //如果不是考生，设置操作人名字为：管理员
                    if(!userEntityDB.getUser_type_name().equals("考生")){
                        userEntityDB.setOperator_name("管理员");
                        userEntityDB.setStu_img("../../static/dist/img/manager.jpg");
                    }

                    session.setAttribute("user", userEntityDB);
                }else {
                    flag = 0;
                    info = "用户名或者密码错误</br>请重新输入!";
                }

            }else{
                //数据库不存在该用户
                flag = 0;
                info = "当前用户不存在</br>请重新输入!";
            }
        }else {
            flag = 0;
            info = "用户名不能为空!";
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("info", info);
        return jsonObject.toString();
    }

    //请求 session数据并返回前端
    @RequestMapping(value = "/sessionAndSecure")
    @ResponseBody
    public String sessionAndSecure(HttpSession session){
        UserEntity user = (UserEntity)session.getAttribute("user");
        System.out.println("获取到的session:"+user);
        int flag = 0;
        List<UserEntity> userEntityList = new ArrayList<>();
        if(user != null){
            flag = 1;
            userEntityList.add(user);
        }

        // 动态构建json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", flag);
        jsonObject.put("user", userEntityList);
        System.out.println("返回前端的session数据"+jsonObject.toString());
        return jsonObject.toString();
    }

    //跳转到首页
    @RequestMapping(value = "/index")
    public String index(){
        return "util/top-left-bar-template";
        //return "index";
    }

    @RequestMapping(value = "/logout")
    //Todo:把链接更新到每个页面右上角登出按钮
    public String logout(HttpSession session) {
        // 清除Session
        session.invalidate();
        // 重定向到登录页面的跳转方法
        return "redirect:/login";
    }



    //下面是示例页面的访问url
    //导航栏模板
    @RequestMapping(value = "/top-left-bar-template")
    public String leftBbarTemplate(){
        return "util/top-left-bar-template";
    }

    @RequestMapping(value = "/starter")
    public String starter(){
        return "starter";
    }

    @RequestMapping("/bmbk-example")
    public String bmbk(){
        return "bmbk-example";
    }

    @RequestMapping(value = "/table-example")
    public String tableExample(){
        return "table-example";
    }

    @RequestMapping(value = "/vuejs-learn")
    public String vuejsLearn(){
        return "vuejs-learn";
    }
}
