package com.xs.boot.controller;

import com.xs.boot.entity.Vio;
import com.xs.boot.entity.Violist;
import com.xs.boot.service.IVioService;
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
@RequestMapping(value = "/violation")
public class VioController {
    @Autowired
    private IVioService vioService;

    @RequestMapping(value = "/toList")
    public String toVioList(){
        return "/tk_violation/violation_list";
    }

    @RequestMapping(value = "/toVio")
    public String toVio(){
        return "/tk_violation/post_list";
    }


    @RequestMapping(value = "/toAdd")
    public String toVioAdd(){
        return "/tk_violation/violation_add";
    }

    @RequestMapping(value = "/toAddpost")
    public String toViopostAdd(){
        return "/tk_violation/post_add";
    }


    @RequestMapping(value = "/getList")
    @ResponseBody
    public List<Vio> getList(){
        List<Vio> vioList = vioService.findAll();
        return vioList;
    }

    @RequestMapping(value = "/addVio")
    public String addVio(@RequestBody Vio vio){
        vioService.addVio(vio);
        return "/tk_violation/violation_list";
    }

    @RequestMapping(value = "/getpostList")
    @ResponseBody
    public List<Violist> getpostList(){
        List<Violist> postList = vioService.findpostAll();
        return postList;
    }

}
