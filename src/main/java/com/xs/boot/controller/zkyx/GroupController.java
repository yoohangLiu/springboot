package com.xs.boot.controller.zkyx;

import com.xs.boot.entity.zkyx.Group_register;
import com.xs.boot.entity.zkyx.Group_signup;
import com.xs.boot.service.zkyx.IGroupRegisterService;
import com.xs.boot.service.zkyx.IGroupSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/group")
public class GroupController {
    /*----------------------------------yuan------------------------------*/
    @Autowired
    private IGroupRegisterService grreService;

    @RequestMapping("/group_register")
    public String group_register(){
        return "zkyx/group/group_register";
    }

    //考生注册添加
    @RequestMapping(value = "/addGroupRegister")
    public String addGroupRegister(@RequestBody Group_register group_register){
        grreService.insert(group_register);
        return "/zkyx/group/group_register";
    }

    @Autowired
    private IGroupSignUpService signupService;


    @RequestMapping("/group_signup")
    public String group_signup(){
        return "zkyx/group/group_signup";
    }

    //考生注册添加
    @RequestMapping(value = "/addGroupSignUp")
    public String addGroupSignUp(@RequestBody Group_signup group_signup){
        signupService.insert(group_signup);
        return "/zkyx/group/group_signup";
    }
    /*--------------------------------------------------------------------*/
}
