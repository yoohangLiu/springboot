package com.xs.boot.controller.zkyx;

import com.xs.boot.entity.zkyx.*;
import com.xs.boot.service.zkyx.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/zkyx")
public class ZkyxController {

    /*- ---------------------------------万虎的代码------------------------------*/


    @Autowired
    private IWhiteListService iWhiteListService;

    @Autowired
    private IQueryStudentService iQueryStudentService;

    @Autowired
    private ExamPointService examPointService;

    @Autowired
    private KcKdService kcKdService;

    @Autowired
    private RecordBkService recordBkService;

    @RequestMapping("/set_white_list")
    public String set_white_list(){
        return "zkyx/set_white_list";
    }

    @RequestMapping(value = "/add_white_list", method = {RequestMethod.POST})
    @ResponseBody
    public WhiteList addWhiteList(@RequestBody WhiteList whiteList){
        iWhiteListService.insert(whiteList);
        return whiteList;
    }

    @RequestMapping(value = "/del_white_list", method = {RequestMethod.POST})
    @ResponseBody
    public WhiteList delWhiteList(@RequestBody WhiteList whiteList, Model model){
        iWhiteListService.delete(whiteList);
        return whiteList;
    }

    @RequestMapping("/query_student")
    public String query_student(){
        return "zkyx/query_student";
    }

    @RequestMapping(value = "/query_students", method = {RequestMethod.POST})
    @ResponseBody
    public Student QueryStudent(@RequestBody Student student, Model model){
        return iQueryStudentService.query(student);
    }


    @RequestMapping("/alter_county")
    public String alter_county(){
        return "zkyx/alter_county";
    }

    @RequestMapping(value = "/alter_countys", method = {RequestMethod.POST})
    @ResponseBody
    public Student AlterCounty(@RequestBody Student student, Model model){
        return iQueryStudentService.alter_county(student);
    }

    @RequestMapping("/set_exam_point")
    public String add_exampoint(){
        return "zkyx/set_exam_point";
    }

    @RequestMapping(value = "/add_exampoints", method = {RequestMethod.POST})
    @ResponseBody
    public ExamPoint add_exampoints(@RequestBody ExamPoint examPoint){
        examPointService.insert(examPoint);
        return examPoint;
    }

    @RequestMapping(value = "/del_exampoints", method = {RequestMethod.POST})
    @ResponseBody
    public ExamPoint del_exampoints(@RequestBody ExamPoint examPoint){
        examPointService.delete(examPoint);
        return examPoint;
    }


    @RequestMapping("/set_kckd")
    public String set_kckd(){
        return "zkyx/set_kckd";
    }

    @RequestMapping(value = "/add_kckd", method = {RequestMethod.POST})
    @ResponseBody
    public KcKd add_kckd(@RequestBody KcKd kcKd){
        kcKdService.insert(kcKd);
        return kcKd;
    }

    @RequestMapping(value = "/del_kckd", method = {RequestMethod.POST})
    @ResponseBody
    public KcKd del_kckd(@RequestBody KcKd kcKd){
        kcKdService.delete(kcKd);
        return kcKd;
    }

    @RequestMapping(value = "/count_kckd", method = {RequestMethod.POST})
    @ResponseBody
    public int count_kckd(@RequestBody KcKd kcKd){
        return kcKdService.count(kcKd);
    }


    @RequestMapping("/arrange_kc")
    public String arrange_kc(){
        return "zkyx/arrange_kc";
    }

    @RequestMapping(value = "/arrange_kcs", method = {RequestMethod.POST})
    @ResponseBody
    public int arrange_kc(@RequestBody RecordBk recordBk){
        return recordBkService.count(recordBk);
    }


    @RequestMapping("/english_site")
    public String english_site(){
        return "zkyx/english_site";
    }

    @RequestMapping(value = "/add_english", method = {RequestMethod.POST})
    @ResponseBody
    public void english_sites(@RequestBody KcKd kcKd){
        kcKdService.English_insert(kcKd);
    }

    @RequestMapping(value = "/del_english", method = {RequestMethod.POST})
    @ResponseBody
    public void english_delete(@RequestBody KcKd kcKd){
        kcKdService.English_delete(kcKd);
    }


    @RequestMapping("/final_arrange")
    public String final_arrange(){ return "zkyx/final_arrange"; }

    @RequestMapping(value = "/arrange_kcs1", method = {RequestMethod.POST})
    @ResponseBody
    public int arrange_kc1(@RequestBody RecordBk recordBk){
        return recordBkService.count1(recordBk);
    }

    @RequestMapping(value = "/arrange_cap_query", method = {RequestMethod.POST})
    @ResponseBody
    public int cap_query(@RequestBody ExamPoint examPoint){
        return examPointService.count_cap(examPoint);
    }


    @RequestMapping(value = "/get_stus", method = {RequestMethod.POST})
    @ResponseBody
    public List<RecordBk> get_stus(@RequestBody RecordBk recordBk){
        return recordBkService.get_list(recordBk);
    }

    @RequestMapping(value = "/get_kds", method = {RequestMethod.POST})
    @ResponseBody
    public List<ExamPoint> get_kds(@RequestBody ExamPoint examPoint){
        return examPointService.get_list(examPoint);
    }

    @RequestMapping(value = "/alt_bks", method = {RequestMethod.POST})
    @ResponseBody
    public void alt_bks(@RequestBody RecordBk recordBk){
        recordBkService.alt_bk(recordBk);
    }


    /*--------------------------------------------------------------------*/
}
