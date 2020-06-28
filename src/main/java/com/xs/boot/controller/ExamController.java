package com.xs.boot.controller;

import com.xs.boot.entity.Blacklist;
import com.xs.boot.entity.Certain_exam_examArea;
import com.xs.boot.entity.Exam;
import com.xs.boot.entity.Kd_info;
import com.xs.boot.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by FF on 2020/6/16.
 */

/**
 * 考务岗Controller
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

    @RequestMapping("/set")
    public String set_exam_time(){
        return "1_kwg_bmbk/set_exam_time";
    }

    @RequestMapping("/ext")
    public String ext_exam_time(){
        return "1_kwg_bmbk/ext_exam_time";
    }

    @RequestMapping("/show")
    public String show_exam(){
        return "1_kwg_bmbk/show_exam";
    }

    @RequestMapping("/set_skbc_time")
    public String set_skbc_time(){
        return "6_kwg_sk_bc/set_sk_bc_time";
    }

    @RequestMapping("/EnKd")
    public String EnKd(){
        return "8_kwg_qtks/create_en_kd";
    }

    @RequestMapping("/set_sk_xk_num")
    public String set_sk_xk_num(){
        return "6_kwg_sk_bc/set_sk_xk_num";
    }

    @RequestMapping("/blacklist")
    public String blacklist(){
        return "5_kwg_tk_qtsb/black_list";
    }

    @RequestMapping(value = "/addExam", method = {RequestMethod.POST})
    @ResponseBody
    public Exam addExam(@RequestBody Exam exam){
        examService.insert(exam);
        return exam;
    }

    @RequestMapping(value = "/find_max", method = {RequestMethod.POST})
    @ResponseBody
    public Exam find_max(@RequestBody Exam exam){
        return examService.find_max(exam);
    }

    @RequestMapping(value = "/findExam", method = {RequestMethod.POST})
    @ResponseBody
    public Exam findExam(@RequestBody Exam exam){
        return examService.findExam(exam);
    }

    @RequestMapping(value = "/allExam", method = {RequestMethod.POST})
    @ResponseBody
    public List<Exam> allExam(){
        return examService.allExam();
    }

    @RequestMapping(value = "/setExamTime", method = {RequestMethod.POST})
    @ResponseBody
    public void setExamTime(@RequestBody Exam exam){
        examService.setExamTime(exam);
    }

    @RequestMapping(value = "/extExamTime", method = {RequestMethod.POST})
    @ResponseBody
    public void extExamTime(@RequestBody Exam exam){
        examService.extExamTime(exam);
    }

    @RequestMapping(value = "/setSkBcTime", method = {RequestMethod.POST})
    @ResponseBody
    public void setSkBcTime(@RequestBody Exam exam){
        examService.setSkBcTime(exam);
    }

    @RequestMapping(value = "/findExam_Kq", method = {RequestMethod.POST})
    @ResponseBody
    public Certain_exam_examArea findExam_Kq(@RequestBody Certain_exam_examArea cee){
        return examService.findExam_Kq(cee);
    }

    @RequestMapping(value = "/setSkXunkao", method = {RequestMethod.POST})
    @ResponseBody
    public void setSkXunkao(@RequestBody Certain_exam_examArea cee){
        examService.setSkXunkao(cee);
    }

    @RequestMapping(value = "/allEnKd", method = {RequestMethod.POST})
    @ResponseBody
    public List<Kd_info> allEnKd(){
        return examService.allEnKd();
    }

    @RequestMapping(value = "/addEnKd", method = {RequestMethod.POST})
    @ResponseBody
    public void addEnKd(@RequestBody Kd_info kd){
        examService.addEnKd(kd);
    }

    @RequestMapping(value = "/deleteEnKd", method = {RequestMethod.POST})
    @ResponseBody
    public void deleteEnKd(@RequestBody Kd_info kd){
        examService.deleteEnKd(kd);
    }

    @RequestMapping(value = "/allBL", method = {RequestMethod.POST})
    @ResponseBody
    public List<Blacklist> allBL(){
        return examService.allBL();
    }

    @RequestMapping(value = "/addBL", method = {RequestMethod.POST})
    @ResponseBody
    public void addBL(@RequestBody Blacklist bl){
        examService.addBL(bl);
    }

    @RequestMapping(value = "/deleteBL", method = {RequestMethod.POST})
    @ResponseBody
    public void deleteBL(@RequestBody Blacklist bl){
        examService.deleteBL(bl);
    }

    @RequestMapping(value = "/toArrangetime")
    private String toArrangetime(){
        return "/tk_arrange/set_arrangetime";
    }

    @RequestMapping(value = "/toJuandai")
    private String toJuandai(){
        return "/tk_arrange/set_spec";
    }

    @RequestMapping(value="/toKaochang")
    private String toKaochang(){
        return "/tk_arrange/kaochang_num";
    }


    @RequestMapping(value = "/toKaochangSet")
    public String toKaochangSet(Model model, Integer kc_code, Integer type_name, String kqu_id){
        model.addAttribute("kc_code",kc_code);
        model.addAttribute("type_name",type_name);
        model.addAttribute("kqu_id",kqu_id);
        return "/tk_arrange/set_kaochang";
    }


    @RequestMapping(value = "/getKqu")
    @ResponseBody
    public List<Exam> getKqu(@RequestBody Exam exam){
        return examService.getKqu(exam);
    }

    @RequestMapping(value ="/getExam1")
    @ResponseBody
    public List<Exam> getExam1(){
        return examService.getExam1();
    }

    @RequestMapping(value = "addKquNum")
    public String addKquNum(@RequestBody Exam exam){
        examService.addKquNum(exam);
        return "/tk_arrange/set_kaochang";
    }


    @RequestMapping(value = "/toZkao")
    private String toZkao(){
        return "/tk_arrange/set_zkao";
    }


    @RequestMapping(value = "/addArrangetime")
    private String addArrange(@RequestBody Exam exam){
        examService.setArrangetime(exam);
        return "/tk_arrange/set_arrangetime";
    }

    @RequestMapping(value = "/addJuandai")
    private String addJuandai(@RequestBody Exam exam){
        examService.setJuandaispec(exam);
        return "/tk_arrange/set_juandai";
    }

    @RequestMapping(value = "/addZkao")
    private String addZkao(@RequestBody Exam exam){
        examService.setZkaoTime(exam);
        return "/tk_arrange/set_zkao";
    }

    @RequestMapping(value = "/getArrangetime")
    @ResponseBody
    private List<Exam> getArrangetime(){
        return examService.getArrangetime();
    }

    @RequestMapping(value = "/getJuandaispec")
    @ResponseBody
    private List<Exam> getJuandaispec(){
        return examService.getJuandaispec();
    }

    @RequestMapping(value = "/getZkaoTime")
    @ResponseBody
    private List<Exam> getZkaoTime(){
        return examService.getArrangetime();
    }
}
