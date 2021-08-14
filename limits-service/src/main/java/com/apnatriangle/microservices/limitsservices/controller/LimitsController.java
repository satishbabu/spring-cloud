package com.apnatriangle.microservices.limitsservices.controller;

import com.apnatriangle.microservices.limitsservices.Configuration;
import com.apnatriangle.microservices.limitsservices.bean.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
