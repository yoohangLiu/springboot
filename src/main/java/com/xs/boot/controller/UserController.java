package com.xs.boot.controller;

import com.xs.boot.entity.User;
import com.xs.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/add")
    public String toView(HttpServletRequest request){
        return "user";
    }

    @RequestMapping(value = "/add_s")
    public String insert(User user, Model model){
        userService.insert(user);
        model.addAttribute("msg","用户保存成功");
        return  "success";
    }

    @RequestMapping(value = "/update")
    public String update(HttpServletRequest request){
        return "update_user";
    }

    @RequestMapping(value = "/update_s")
    public String update_s(User user, Model model){
        userService.update(user);
        model.addAttribute("msg","用户修改成功");
        return  "success";
    }

    @RequestMapping(value = "/find")
    public String find(HttpServletRequest request){
        return "find_user";
    }

    @RequestMapping(value = "/find_s")
    public String find_s(int id, Model model){
        model.addAttribute("msg",userService.findById(id).toString());
        return  "success";
    }

    @RequestMapping(value = "/delete")
    public String delete(HttpServletRequest request){
        return "delete_user";
    }

    @RequestMapping(value = "/delete_s")
    public String delete_s(int id, Model model){
        userService.deleteById(id);
        model.addAttribute("msg","用户删除成功");
        return  "success";
    }
}
