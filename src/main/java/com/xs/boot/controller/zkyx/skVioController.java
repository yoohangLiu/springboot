package com.xs.boot.controller.zkyx;


import com.xs.boot.entity.zkyx.skVio;
import com.xs.boot.entity.zkyx.skViolist;
import com.xs.boot.service.zkyx.skIVioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by DELL on 2020/6/19.
 */
@Controller
@RequestMapping(value = "/sk_violation")
public class skVioController {
    @Autowired
    private skIVioService vioService;

    @RequestMapping(value = "/toList")
    public String toVioList(){
        return "/zkyx/violation/violation_list";
    }

    //违规考生查询
    @RequestMapping(value = "/toVio")
    public String toVio(){
        return "/zkyx/violation/post_list";
    }

    //违规考生添加
    @RequestMapping(value = "/toAddpost")
    public String toViopostAdd(){
        return "/zkyx/violation/post_add";
    }

    //违规添加操作
    @RequestMapping(value = "/addPost")
    public String addPost(@RequestBody skViolist violist){
        System.out.println("显示结果");
        vioService.addPost(violist);
        return "/zkyx/violation/violation_list";
    }

    //搜索post需要的操作
    @RequestMapping(value = "/findPostNeed")
    @ResponseBody
    public skViolist findPostNeed(){
        skViolist postneed = vioService.findPostNeed();
        return postneed;
    }

    @RequestMapping(value = "/getList")
    @ResponseBody
    public List<skVio> getList(){
        List<skVio> vioList = vioService.findAll();
        return vioList;
    }

    @RequestMapping(value = "/getpostList")
    @ResponseBody
    public List<skViolist> getpostList(){
        List<skViolist> postList = vioService.findpostAll();
        return postList;
    }

}