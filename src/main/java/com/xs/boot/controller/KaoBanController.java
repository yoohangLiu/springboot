package com.xs.boot.controller;

import com.xs.boot.entity.Certain_exam_examArea;
import com.xs.boot.entity.Certain_kqu_kd;
import com.xs.boot.entity.Orgnization_memo;
import com.xs.boot.service.IKaoBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/kaoban")
public class KaoBanController {

    @Autowired
    private IKaoBanService kaoBanService;

    @RequestMapping(value = "/setCapacity", method = {RequestMethod.POST})
    public String jumpSet(@RequestBody Certain_exam_examArea kqu_id, Model model) {
        model.addAttribute("kc_code", kqu_id.getKc_code());
        model.addAttribute("type_name", kqu_id.getType_name());
        model.addAttribute("kqu_id", kqu_id.getKqu_id());
        return "kaoban/Kqu_info_report";
    }

    @RequestMapping(value = "/find_exam", method = {RequestMethod.POST})
    @ResponseBody
    public List<Certain_exam_examArea> findExam(@RequestBody Certain_exam_examArea kqu_id){
        return kaoBanService.find_exam(kqu_id);
    }
    @RequestMapping(value = "/find_exam2", method = {RequestMethod.POST})
    @ResponseBody
    public Orgnization_memo findExam2(@RequestBody Orgnization_memo kqu_id){
        return kaoBanService.find_exam2(kqu_id);
    }


    @RequestMapping("/seeKd")
    public String alter(){
        return "/kaoban/Kd_info_report";
    }

    @RequestMapping("/seeCapacity")
    public String see_exam(){
        return "/kaoban/show_examroom_capacity";
    }

    @RequestMapping("/seeOrgnization")
    public String see_orgnization(){
        return "/kaoban/Organization_report";
    }

    @RequestMapping(value = "/addCapacity", method = {RequestMethod.POST})
    @ResponseBody
    public void addCapacity(@RequestBody Certain_exam_examArea certain_exam_examArea){
        kaoBanService.addCapacity(certain_exam_examArea);
    }

    @RequestMapping(value = "/addOrganizationMemo", method = {RequestMethod.POST})
    @ResponseBody
    public void addOrganizationMemo(@RequestBody Orgnization_memo certain_exam_examArea){
        kaoBanService.addOrganizationMemo(certain_exam_examArea);
    }


    @RequestMapping(value = "/alter_certain_kqu_kd", method = {RequestMethod.POST})
    @ResponseBody
    public void alterCertainKquKd(@RequestBody Certain_kqu_kd certain_kqu_kd){
        kaoBanService.alterCertainKquKd(certain_kqu_kd);
    }

    @RequestMapping(value = "/find_kqu_kd", method = {RequestMethod.POST})
    @ResponseBody
    public List<Certain_kqu_kd> find_kqukd(@RequestBody Certain_kqu_kd certain_kqu_kd){
        return kaoBanService.find_kqu_kd(certain_kqu_kd);
    }

}
