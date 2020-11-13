package com.lanxx.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanxiongxiong
 */
@RestController
public class ProviderController {

    Logger logger=LoggerFactory.getLogger(ProviderController.class);

    @GetMapping("/hi")
    public String hello(@RequestParam(value = "name",defaultValue = "forezp",required = false) String name){
        return "hello:"+name;
    }
}
