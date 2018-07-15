package com.dxf.controller;

import com.dxf.beans.MyBean;
import com.dxf.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    MyBean myBean;

    @Autowired
    MyService myService;

    @RequestMapping("/")
    public String home() {
        System.out.println(myService.getProperties().getSecurity().getPassword());
        String s = myBean.getName();

        return s;
    }
}
