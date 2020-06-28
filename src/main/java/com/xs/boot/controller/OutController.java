package com.xs.boot.controller;

import com.xs.boot.entity.OutData;
import com.xs.boot.service.impl.OutService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by DELL on 2020/6/24.
 */
@Controller
@RequestMapping(value = "/out")
public class OutController {

    @Resource
    private OutService outService;


    @RequestMapping(value = "/toList")
    public String toList(){
        return "/tk_outdata/outdata";
    }


    @RequestMapping(value = "/getList")
    @ResponseBody
    public List<OutData> getList(@RequestBody OutData outData){
        return outService.getList(outData);
    }

    @RequestMapping(value="getExam")
    @ResponseBody
    public List<OutData> getExam(){
        return outService.getExam();
    }
}
