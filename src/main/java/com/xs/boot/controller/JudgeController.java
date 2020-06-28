package com.xs.boot.controller;

import com.xs.boot.entity.Judge;
import com.xs.boot.service.impl.JudgeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by DELL on 2020/6/23.
 */
@Controller
@RequestMapping(value = "/judge")
public class JudgeController {

    @Resource
    private JudgeServiceImpl judgeService;


    @RequestMapping(value = "toJudge")
    public String toJudge(){
        return "/tk_judge/judge_school";
    }

    @RequestMapping(value = "toSet")
    public String toSet(){
        return "/tk_judge/set_school";
    }

    @RequestMapping(value = "toSet1")
    public String toSet1(Model model, Integer kc_code, Integer type_name, Integer major_id, Integer course_id){
        model.addAttribute("kc_code",kc_code);
        model.addAttribute("type_name",type_name);
        model.addAttribute("major_id",major_id);
        model.addAttribute("course_id",course_id);
        return "/tk_judge/set_school";
    }


    @RequestMapping(value ="getjudgelist")
    @ResponseBody
    public List<Judge> getjudgeList(){
        return judgeService.getjudgeList();
    }

    @RequestMapping(value ="getschoollist")
    @ResponseBody
    public List<Judge> getschoolList(){
        return judgeService.getschoolList();
    }

    @RequestMapping(value = "addJudge")
    public String addJudge(@RequestBody Judge judge){
        judgeService.addJudge(judge);
        return "/tk_judge/judge_school";
    }


}
