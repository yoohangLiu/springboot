package com.xs.boot.controller;


import com.xs.boot.entity.Kb_statistic;
import com.xs.boot.service.Kb_statisticService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/statistic")
public class Kb_statisticController {
    @Resource
    private Kb_statisticService kb_statisticService;

    @RequestMapping("/examdate")
    public String sta_examdate() {
        return "kaoban/statistics_examdate.html";
    }

    @RequestMapping("/toFenjuan")
    public String toFenjuan(){ return "kaoban/statistics_fenjuan.html";}

    @RequestMapping(value = "/toJDlist")
    public String tojdlist(){
        return "/kaoban/statistics_juandai.html";
    }

    @RequestMapping(value = "/kbbc")
    public String Kbbc(){
        return "/kaoban/kb_bc.html";
    }

    @RequestMapping(value = "/getList1", method = {RequestMethod.POST})
    @ResponseBody
    public List<Kb_statistic> getList_1(@RequestBody Kb_statistic kb_statistic){
        return kb_statisticService.getList_1(kb_statistic); }


    @RequestMapping(value = "/getList2", method = {RequestMethod.POST})
    @ResponseBody
    public List<Kb_statistic> getList_2(@RequestBody Kb_statistic kb_statistic){
        return kb_statisticService.getList_2(kb_statistic); }

    @RequestMapping(value = "/getExam", method = {RequestMethod.POST})
    @ResponseBody
    public List<Kb_statistic> getExam() { return kb_statisticService.getExam(); }

    @RequestMapping(value = "/getFenjuan1")
    @ResponseBody
    public List<Kb_statistic> getFenjuan1(@RequestBody Kb_statistic kb_statistic)
    {
        return kb_statisticService.getFenjuan1(kb_statistic);
    }

    @RequestMapping(value = "/getFenjuan2")
    @ResponseBody
    public List<Kb_statistic> getFenjuan2(@RequestBody Kb_statistic kb_statistic)
    {
        return kb_statisticService.getFenjuan2(kb_statistic);
    }

    @RequestMapping(value = "/getJDlist1")
    @ResponseBody
    public List<Kb_statistic> getZJlist1(@RequestBody Kb_statistic kb_statistic)
    {
        return kb_statisticService .getJDlist1(kb_statistic);
    }

    @RequestMapping(value = "/getJDlist2")
    @ResponseBody
    public List<Kb_statistic> getZJlist2(@RequestBody Kb_statistic kb_statistic)
    {
        return kb_statisticService .getJDlist2(kb_statistic);
    }

    @RequestMapping(value = "/getBClist1")
    @ResponseBody
    public List<Kb_statistic> getBClist1(@RequestBody Kb_statistic kb_statistic)
    {
        return kb_statisticService .getBClist1(kb_statistic);
    }

    @RequestMapping(value = "/getBClist2")
    @ResponseBody
    public List<Kb_statistic> getBClist2(@RequestBody Kb_statistic kb_statistic)
    {
        return kb_statisticService .getBClist2(kb_statistic);
    }
}
