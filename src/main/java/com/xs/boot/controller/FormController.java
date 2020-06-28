package com.xs.boot.controller;

import com.xs.boot.entity.Form;
import com.xs.boot.service.impl.FormServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/form")
public class FormController {

    @Resource
    private FormServiceImpl formService;

    @RequestMapping(value = "/toZJlist")
    public String toZJlist(){
        return "/tk_tongji/ZJ_num";
    }

    @RequestMapping(value = "/toSchool")
    public String toSchool(){
        return "/tk_tongji/school_list";
    }

    @RequestMapping(value = "/toFenjuan")
    public String toFenjuan(){
        return "/tk_tongji/fenjuan_list";
    }

    @RequestMapping(value = "/toTime")
    public String toTime(){
        return "/tk_tongji/time_list";
    }

    @RequestMapping(value="getExam")
    @ResponseBody
    public List<Form> getExam(){
        return formService.getExam();
    }

    @RequestMapping(value = "/getZJlist")
    @ResponseBody
    public List<Form> getZJlist(@RequestBody Form form)
    {
        return formService .getZJlist(form);
    }

    @RequestMapping(value = "/toCourselist")
    public String toCourselist(){
        return "/tk_tongji/course_list";
    }

    @RequestMapping(value = "/getCourselist")
    @ResponseBody
    public List<Form> getCourselist(@RequestBody Form form)
    {
        return formService .getCourselist(form);
    }

    @RequestMapping(value = "/getSchool")
    @ResponseBody
    public List<Form> getSchool()
    {
        return formService .getSchool();
    }

    @RequestMapping(value = "/getFenjuan")
    @ResponseBody
    public List<Form> getFenjuan(@RequestBody Form form)
    {
        return formService.getFenjuan(form);
    }

    @RequestMapping(value = "/getTime")
    @ResponseBody
    public List<Form> getTime(@RequestBody Form form)
    {
        return formService.getTime(form);
    }

}
