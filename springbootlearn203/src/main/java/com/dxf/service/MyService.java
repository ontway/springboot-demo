package com.dxf.service;

import com.dxf.properties.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final AcmeProperties properties;

    @Autowired
    public MyService(AcmeProperties properties) {
        this.properties = properties;
    }

    public AcmeProperties getProperties() {
        return properties;
    }
}
