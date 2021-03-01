package com.example.demo.controller;

import com.example.demo.service.HellowWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private HellowWord hellowWord;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test(){
        hellowWord.sendMsg();
    }

}
