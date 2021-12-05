package com.example.configdemo.web;

import com.example.configdemo.config.BasicConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/surfboard")
public class SurfboardController {

    @Autowired
    private BasicConfig config;

    @GetMapping
    public String method(){
        return config.getMyConf() + config.getMyOtherConf();
    }
}
