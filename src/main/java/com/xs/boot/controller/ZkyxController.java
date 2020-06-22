package com.xs.boot.controller;

import com.xs.boot.entity.Exam;
import com.xs.boot.entity.zkyx.WhiteList;
import com.xs.boot.service.zkyx.IWhiteListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/zkyx")
public class ZkyxController {

    /*----------------------------------yuan------------------------------*/
    @RequestMapping("/group")
    public String group_register(){
        return "zkyx/group_register";
    }

    /*--------------------------------------------------------------------*/

    /*- ---------------------------------万虎的代码------------------------------*/

    @Autowired
    private IWhiteListService iWhiteListService;

    @RequestMapping("/set_white_list")
    public String set_white_list(){
        return "zkyx/set_white_list";
    }

    @RequestMapping(value = "/add_white_list", method = {RequestMethod.POST})
    @ResponseBody
    public WhiteList addWhiteList(@RequestBody WhiteList whiteList, Model model){
        iWhiteListService.insert(whiteList);
        return whiteList;
    }

    @RequestMapping(value = "/del_white_list", method = {RequestMethod.POST})
    @ResponseBody
    public WhiteList delWhiteList(@RequestBody WhiteList whiteList, Model model){
        iWhiteListService.delete(whiteList);
        return whiteList;
    }
    /*--------------------------------------------------------------------*/
}
