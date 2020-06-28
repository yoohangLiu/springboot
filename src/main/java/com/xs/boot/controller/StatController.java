package com.xs.boot.controller;

/**
 * Created by asus on 2020/6/24.
 */
import com.xs.boot.entity.Paper;
import com.xs.boot.entity.Sche;
import com.xs.boot.service.IStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/stat")
public class StatController {
    @Autowired
    private IStatService statService;

    @RequestMapping("/paper_q")
    public String paper_q(){
        return "11_kwg_skbb/paper_query";
    }

    @RequestMapping("/sche_q")
    public String sche_q(){
        return "11_kwg_skbb/sche_query";
    }

    @RequestMapping("/kd_paper_q")
    public String kd_paper_q(){
        return "11_kwg_skbb/kd_paper_query";
    }

    @RequestMapping("/bag_q")
    public String bag_q(){
        return "11_kwg_skbb/bag_query";
    }

    @RequestMapping(value = "/paper_query", method = {RequestMethod.POST})
    @ResponseBody
    public List<Paper> paper_query(@RequestBody Paper paper){
        return statService.paper_query(paper);
    }

    @RequestMapping(value = "/sche_query", method = {RequestMethod.POST})
    @ResponseBody
    public List<Sche> sche_query(@RequestBody Sche sche){
        return statService.sche_query(sche);
    }

    @RequestMapping(value = "/kd_paper_query", method = {RequestMethod.POST})
    @ResponseBody
    public List<Paper> kd_paper_query(@RequestBody Paper paper){
        return statService.kd_paper_query(paper);
    }

}
