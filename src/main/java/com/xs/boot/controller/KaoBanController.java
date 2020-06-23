package com.xs.boot.controller;

import com.xs.boot.entity.Certain_kqu_kd;
import com.xs.boot.service.IKaoBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/kaoban")
public class KaoBanController {

    @Autowired
    private IKaoBanService kaoBanService;

    @RequestMapping("/seeCapacity")
    public String create_exam(){
        return "kaoban/report_examroom_capacity";
    }

    @RequestMapping(value = "/find_kqu_kd", method = {RequestMethod.POST})
    @ResponseBody
    public List<Certain_kqu_kd> find_kqukd(@RequestBody Certain_kqu_kd certain_kqu_kd){
        return kaoBanService.find_kqu_kd(certain_kqu_kd);
    }

//
//    @RequestMapping(value = "/addRongliang", method = {RequestMethod.POST})
//    @ResponseBody
//    public String addCapacity(@RequestBody String exam, Model model){
//        kaoBanService.addKaoChangRongLiang(1);
//        return exam;
//    }
}
