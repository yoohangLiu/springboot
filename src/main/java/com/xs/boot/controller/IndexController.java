package com.xs.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    /**
     * 默认启动页设置
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }


    //下面是示例页面的访问url
    @RequestMapping(value = "/starter")
    public String starter(){
        return "starter";
    }

    @RequestMapping("/bmbk-example")
    public String bmbk(){
        return "bmbk-example";
    }

    @RequestMapping(value = "/table-example")
    public String tableExample(){
        return "table-example";
    }

    @RequestMapping(value = "/vuejs-learn")
    public String vuejsLearn(){
        return "vuejs-learn";
    }
}
