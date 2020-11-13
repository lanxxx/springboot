package com.lanxx.springboot.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanxiongxiong
 */
@RestController
public class ActiveMsgListener {

    @JmsListener(destination = "q2")
    public void rctiveMsg(String message){
        System.out.println("------监听到activemq的数据"+message);
    }
}
