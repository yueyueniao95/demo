package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hellowWord")
public class Consumer {

    @RabbitHandler()
    public void receiveMsg(String msg){
        System.out.println("接收到消息:"+msg);
    }

}
