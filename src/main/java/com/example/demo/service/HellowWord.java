package com.example.demo.service;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HellowWord {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMsg(){
        rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(CorrelationData correlationData, boolean b, String s) {
                if(b){
                    System.out.println("消息发送成功"+s);
                }else{
                    System.out.println("消息发送失败"+s);
                }
            }
        });
        rabbitTemplate.convertAndSend("","hellowWord", "hellow word message");
    }
}
