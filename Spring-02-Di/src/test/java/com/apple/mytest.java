package com.apple;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Double_apple
 * @Date 2022/1/18 23:43
 * @Version 1.0
 */
public class mytest {

    @Test
    public void t1(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student.toString());
    }
}
