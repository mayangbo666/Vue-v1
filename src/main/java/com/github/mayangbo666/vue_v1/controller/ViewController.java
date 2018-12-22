package com.github.mayangbo666.vue_v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {

//    @ResponseBody
    @RequestMapping("/vue")
    public String testVue(){
        return "web-vue/testVue";
    }
}
