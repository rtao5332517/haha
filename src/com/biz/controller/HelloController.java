package com.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Welcome(ModelMap m) {
        System.out.println("-----------------controller--------------------");
    m.addAttribute("name","Hello ，味精");
    return "hahaha";
    }
}
