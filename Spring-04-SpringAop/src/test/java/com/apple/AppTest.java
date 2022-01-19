package com.apple;

import static org.junit.Assert.assertTrue;

import com.apple.aspectj框架实现代理.service.Sservice;
import com.apple.service.ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void t1() {
        ServiceImpl service = new ServiceImpl();
        service.doOther();
        service.doSome();
    }

    @Test
    public void t2(){
        ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
        Sservice proxy = (Sservice) apc.getBean("service");
        System.out.println(proxy.getClass().getName());
        proxy.doSome();
    }
}
