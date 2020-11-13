package com.lanxx.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author lanxiongxiong
 */
@RestController
public class ActivemqController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @RequestMapping("/sendMsg")
    public void sendMsg(String msg){
        jmsTemplate.send("q2", new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage=session.createTextMessage();
                textMessage.setText(msg);
                return textMessage;
            }
        });
    }
}
