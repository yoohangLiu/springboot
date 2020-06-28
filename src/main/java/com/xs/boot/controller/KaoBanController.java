package com.xs.boot.controller;

import com.xs.boot.entity.myKaoban.*;
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

    @RequestMapping("/seeLingjuan")
    public String see_Lingjuan(){
        return "/kaoban/Lingjuan_people_report";
    }

    @RequestMapping("/seeReportVio")
    public String seeReportVio(){
        return "/kaoban/violation_see";
    }

    @RequestMapping("/seeTotalKd")
    public String seeTotalKd(){
        return "/kaoban/Add_kd_info";
    }

    @RequestMapping("/seeSetKcKd")
    public String seeSetKcKd(){
        return "/kaoban/set_kc_kd";
    }
    @RequestMapping("/seeShizhouSetCertainArea")
    public String seeShizhouSetCertainArea(){
        return "/kaoban/shizhou_set_certain_area";
    }

    @RequestMapping("/seeCheckKaosheng")
    public String checkKaosheng(){
        return "/kaoban/check_kaosheng_info";
    }

    @RequestMapping("/seeYupai")
    public String seeYupai(){
        return "/kaoban/Yupai";
    }

    @RequestMapping(value = "/find_exam", method = {RequestMethod.POST})
    @ResponseBody
    public List<Certain_exam_examArea> findExam(@RequestBody Certain_exam_examArea kqu_id){
        return kaoBanService.find_exam(kqu_id);
    }
    @RequestMapping(value = "/find_shizhou_certain_area", method = {RequestMethod.POST})
    @ResponseBody
    public List<Certain_exam_examArea> find_shizhou_certain_area(@RequestBody Certain_exam_examArea kqu_id){
        return kaoBanService.find_shizhou_certain_area(kqu_id);
    }
    @RequestMapping(value = "/find_tongkao", method = {RequestMethod.POST})
    @ResponseBody
    public List<Lingjuan_list> findExam(@RequestBody Lingjuan_list kqu_id){
        return kaoBanService.find_tongkao(kqu_id);
    }

    @RequestMapping(value = "/find_exam2", method = {RequestMethod.POST})
    @ResponseBody
    public Orgnization_memo findExam2(@RequestBody Orgnization_memo kqu_id){
        return kaoBanService.find_exam2(kqu_id);
    }

    @RequestMapping(value = "/find_Lingjuan", method = {RequestMethod.POST})
    @ResponseBody
    public Lingjuan_list find_Lingjuan(@RequestBody Lingjuan_list kqu_id){
        return kaoBanService.find_Lingjuan(kqu_id);
    }
    @RequestMapping(value = "/find_total_kd", method = {RequestMethod.POST})
    @ResponseBody
    public List<Kd_info> find_total_kd(){
        return kaoBanService.find_total_kd();
    }
    @RequestMapping(value = "/findMaxKd_id", method = {RequestMethod.POST})
    @ResponseBody
    public Kd_info find_max_kd_id(){
        return kaoBanService.find_max_kd_id();
    }


    @RequestMapping(value = "/find_exam3", method = {RequestMethod.POST})
    @ResponseBody
    public List<Certain_kqu_kd> findExam3(@RequestBody Certain_kqu_kd kqu_id){
        return kaoBanService.find_exam3(kqu_id);
    }

    @RequestMapping(value = "/select_kaochang_spec_and_num", method = {RequestMethod.POST})
    @ResponseBody
    public List<Certain_kqu_kd> select_kaochang_spec_and_num(@RequestBody Certain_kqu_kd kqu_id){
        return kaoBanService.select_kaochang_spec_and_num(kqu_id);
    }


    @RequestMapping(value = "/getViolationList", method = {RequestMethod.POST})
    @ResponseBody
    public List<Violist> getViolationList(@RequestBody Violist kqu_id){
        return kaoBanService.find_vioList(kqu_id);
    }

    @RequestMapping(value = "/select_bk_student_num", method = {RequestMethod.POST})
    @ResponseBody
    public List<Certain_exam_examArea> select_bk_student_num(@RequestBody Certain_exam_examArea kqu_id){
        return kaoBanService.select_bk_student_num(kqu_id);
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
    @RequestMapping(value = "/addLingjuanList", method = {RequestMethod.POST})
    @ResponseBody
    public void addLingjuanList(@RequestBody Lingjuan_list certain_exam_examArea){
        kaoBanService.addLingjuanList(certain_exam_examArea);
    }
    @RequestMapping(value = "/addViolationList", method = {RequestMethod.POST})
    @ResponseBody
    public void addViolationList(@RequestBody Violist certain_exam_examArea){
        kaoBanService.addViolationList(certain_exam_examArea);
    }
    @RequestMapping(value = "/addKd_info", method = {RequestMethod.POST})
    @ResponseBody
    public void addKd_info(@RequestBody Kd_info certain_exam_examArea){
        kaoBanService.addKd_info(certain_exam_examArea);
    }
    @RequestMapping(value = "/insert_certain_kqu_kd", method = {RequestMethod.POST})
    @ResponseBody
    public void insert_certain_kqu_kd(@RequestBody Certain_kqu_kd certain_kqu_kd){
        kaoBanService.insert_certain_kqu_kd(certain_kqu_kd);
    }

    @RequestMapping(value = "/insert_Certain_Kqu", method = {RequestMethod.POST})
    @ResponseBody
    public void insert_Certain_Kqu(@RequestBody Certain_exam_examArea certain_kqu_kd){
        kaoBanService.insert_Certain_Kqu(certain_kqu_kd);
    }


    @RequestMapping(value = "/delete_kd_info", method = {RequestMethod.POST})
  //  @ResponseBody
    public String delete_kd_info(@RequestBody Kd_info certain_exam_examArea){
        kaoBanService.delete_kd_info(certain_exam_examArea);
        return "redirect:/kaoban/seeTotalKd";
    }
    @RequestMapping(value = "/alter_certain_kqu_kd", method = {RequestMethod.POST})
    @ResponseBody
    public void alterCertainKquKd(@RequestBody Certain_kqu_kd certain_kqu_kd){
        kaoBanService.alterCertainKquKd(certain_kqu_kd);
    }
    @RequestMapping(value = "/alter_certain_kqu_kd2", method = {RequestMethod.POST})
    @ResponseBody
    public void alterCertainKquKd2(@RequestBody Certain_kqu_kd certain_kqu_kd){
        kaoBanService.alterCertainKquKd2(certain_kqu_kd);
    }
    @RequestMapping(value = "/alterOneState", method = {RequestMethod.POST})
    @ResponseBody
    public void alterOneState(@RequestBody StudentInfo certain_kqu_kd){
        kaoBanService.alterOneState(certain_kqu_kd);
    }
    @RequestMapping(value = "/alterAllState", method = {RequestMethod.POST})
    @ResponseBody
    public void alterAllState(@RequestBody StudentInfo certain_kqu_kd){
        kaoBanService.alterAllState(certain_kqu_kd);
    }
    @RequestMapping(value = "/find_kqu_kd", method = {RequestMethod.POST})
    @ResponseBody
    public List<Certain_kqu_kd> find_kqukd(@RequestBody Certain_kqu_kd certain_kqu_kd){
        return kaoBanService.find_kqu_kd(certain_kqu_kd);
    }
    @RequestMapping(value = "/find_student_info", method = {RequestMethod.POST})
    @ResponseBody
    public List<StudentInfo> find_student_info(@RequestBody StudentInfo certain_kqu_kd){
        return kaoBanService.find_student_info(certain_kqu_kd);
    }
}
