package com.test;

import com.test.service.SayHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml") ;
        SayHello sayHello =(SayHello) applicationContext.getBean("sayHello") ;
        System.out.println(sayHello.say("123"));
    }

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml") ;
        SayHello sayHello =(SayHello) applicationContext.getBean("sayHello") ;
        System.out.println(sayHello.say("123"));
    }
}
