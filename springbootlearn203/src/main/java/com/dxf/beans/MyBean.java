package com.dxf.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @Value("${name}")
    private String name;

    @Value("${moudle}")
    private int moudle;

    public int getMoudle() {
        return moudle;
    }

    public void setMoudle(int moudle) {
        this.moudle = moudle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
