package com.xs.boot.controller;

import com.xs.boot.service.IKaoBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kaoban")
public class KaoBanController {
    @Autowired
    private IKaoBanService kaoBanService;

}
