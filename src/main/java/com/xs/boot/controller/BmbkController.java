package com.xs.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by FF on 2020/6/17.
 */
@Controller
@RequestMapping("/bmbk")
public class BmbkController {
    @RequestMapping("/")
    public String bmbk(){
        return "bmbk";
    }
}
