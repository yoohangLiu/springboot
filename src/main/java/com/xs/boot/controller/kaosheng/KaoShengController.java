package com.xs.boot.controller.kaosheng;

import com.xs.boot.entity.kaosheng.StudentInfoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FF on 2020/6/22.
 */
@Controller
@RequestMapping("/kaosheng")
public class KaoShengController {
    @RequestMapping("/goto-personal-regist")
    public String gotoPersonalRegist(){
        return "kaosheng/personal-regist";
    }


    @RequestMapping("/personal-regist")
    @ResponseBody
    public List personalRegist(@RequestBody StudentInfoEntity studentInfoEntity) {
        //JSONObject jsonObject = new JSONObject();
        //try {
        //    jsonObject.put("ff", "hello");
        //} catch (JSONException e) {
        //    e.printStackTrace();
        //}
        System.out.println(studentInfoEntity);
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //jsonObject.put("list", list);
        return list;
    }
}
