package com.test.controller;

import com.test.service.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.swing.*;

@Controller
@RequestMapping("/test")
public class TestController {


    @Autowired
    private SayHello sayHello;




    @RequestMapping("/ts")
    @ResponseBody
    public String test(){
        String s = sayHello.say("asdfasdfa") ;
        return s ;
    }



//    public static void main(String[] args){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("./spring-context.xml");
//        SayHello sayHello = (SayHello) applicationContext.getBean("sayHelloImpl");
//        String s = sayHello.say("sssss") ;
//        System.out.println(s);
//    }
}


