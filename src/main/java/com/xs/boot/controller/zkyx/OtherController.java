package com.xs.boot.controller.zkyx;


import com.xs.boot.entity.zkyx.Other;
import com.xs.boot.service.zkyx.IOtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

;


/**
 * Created by Yuan on 2020/6/25.
 */
@Controller
@RequestMapping(value = "/sk_other")
public class OtherController {


    @Autowired
    private IOtherService otherService;

    @RequestMapping(value = "/graduation")
    public String toGraduation(){
        return "/zkyx/other/graduation";
    }

    @RequestMapping(value = "/addGraduation", method = {RequestMethod.POST})
    @ResponseBody
    public Other addGraduation(@RequestBody Other other, Model model){
        otherService.insert(other);
        return other;
    }

    @RequestMapping(value = "/practice")
    public String toPractice(){
        return "/zkyx/other/practice";
    }

    @RequestMapping(value = "/addPractice", method = {RequestMethod.POST})
    @ResponseBody
    public Other addPractice(@RequestBody Other other, Model model){
        otherService.insert(other);
        return other;
    }

    @RequestMapping(value = "/computer")
    public String toComputer(){
        return "/zkyx/other/computer";
    }

    @RequestMapping(value = "/addComputer", method = {RequestMethod.POST})
    @ResponseBody
    public Other addComputer(@RequestBody Other other, Model model){
        otherService.insert(other);
        return other;
    }
}
