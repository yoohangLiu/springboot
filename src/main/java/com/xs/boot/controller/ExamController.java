package com.xs.boot.controller;

import com.xs.boot.entity.Exam;
import com.xs.boot.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by FF on 2020/6/16.
 */
@Controller
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    private IExamService examService;

    @RequestMapping("/create")
    public String create_exam(){
        return "1_kwg_bmbk/create_exam";
    }

    @RequestMapping("/find")
    public String find_exam(){
        return "table-example";
    }

    @RequestMapping(value = "/addExam", method = {RequestMethod.POST})
    @ResponseBody
    public Exam addExam(@RequestBody Exam exam, Model model){
        examService.insert(exam);
        return exam;
    }

    @RequestMapping(value = "/find_max", method = {RequestMethod.POST})
    @ResponseBody
    public Exam find_max(@RequestBody Exam exam, Model model){
        Exam ret = examService.find_max(exam);
        return ret;
    }

    @RequestMapping(value = "/findExam", method = {RequestMethod.POST})
    @ResponseBody
    public Exam findExam(@RequestBody Exam exam, Model model){
        Exam examNew = examService.findExam(exam);
        return examNew;
    }
}
