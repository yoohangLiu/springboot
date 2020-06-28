package com.xs.boot.controller;

import com.xs.boot.entity.Kb_zkz;
import com.xs.boot.service.Kb_zkzService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/kb_zkz")
public class Kb_zkzController {
    @Resource Kb_zkzService kb_zkzService;
    @RequestMapping("/zkz")
    public String kb_zkz(){return  "kaoban/dayin_zkz.html";}


    @RequestMapping(value = "/getExam", method = {RequestMethod.POST})
    @ResponseBody
    public List<Kb_zkz> getExam() { return kb_zkzService.getExam(); }

    @RequestMapping(value = "/getList1", method = {RequestMethod.POST})
    @ResponseBody
    public List<Kb_zkz> getList1(@RequestBody Kb_zkz kb_zkz){
        return kb_zkzService.getList1(kb_zkz); }

    @RequestMapping(value = "/getList2", method = {RequestMethod.POST})
    @ResponseBody
    public List<Kb_zkz> getList2(@RequestBody Kb_zkz kb_zkz){
        return kb_zkzService.getList2(kb_zkz); }
}
