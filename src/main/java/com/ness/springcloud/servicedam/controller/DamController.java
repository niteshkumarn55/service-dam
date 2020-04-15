package com.ness.springcloud.servicedam.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DamController {

    @Value("${damValue: Default digital asset}")
    private String damValue;

    @GetMapping(value = "/dam")
    public String getValidation(){
        return damValue;
    }
}
