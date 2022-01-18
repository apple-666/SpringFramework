package com.apple;

import com.apple.service.impl.SserviceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author Double_apple
 * @Date 2022/1/18 20:47
 * @Version 1.0
 */

public class mytest {


    //手动创建对象
    @Test
    public void t1(){
        SserviceImpl sservice = new SserviceImpl();
        sservice.doSome();
    }

    //由spring ioc容器拿对象
    @Test
    public void t2(){
        String configname = "applicationContext.xml";
        //在调用applicationContext时 就会生成所有bean（同时会调用所有对象的构造方法）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configname);
        SserviceImpl sservice1 = (SserviceImpl) applicationContext.getBean("service");
        SserviceImpl sservice2 = (SserviceImpl) applicationContext.getBean("service");
        System.out.print("sservice1和sservice2是否为同一对象："); //spring 的ioc bean的scope 默认为单例
        System.out.println(sservice1==sservice2);
    }


    //获取bean信息
    @Test
    public void t3(){
        String configname = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configname);
        System.out.println(applicationContext.getBeanDefinitionCount()+"个对象");
        String beans [] = applicationContext.getBeanDefinitionNames();
//        System.out.println(applicationContext.getBeanDefinitionNames());
        for(String name : beans) System.out.println(name);
    }
}
