package com.dxf.controller;

import com.dxf.beans.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    MyBean myBean;

    @RequestMapping("/")
    public String home() {
        String s = myBean.getName();
        return s;
    }
}
