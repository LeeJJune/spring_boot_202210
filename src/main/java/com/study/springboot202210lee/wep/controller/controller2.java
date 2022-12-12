package com.study.springboot202210lee.wep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller2 {

    @GetMapping("/controller/2")
    public String load(Model model) {
        model.addAttribute("name", "김준일");
        model.addAttribute("tel", "000-000-000");
        return "controller_test";
    }

}
