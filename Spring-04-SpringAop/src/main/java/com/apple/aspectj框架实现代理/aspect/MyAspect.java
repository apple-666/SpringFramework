package com.apple.aspectj框架实现代理.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @Author Double_apple
 * @Date 2022/1/19 20:45
 * @Version 1.0
 */
@Aspect
public class MyAspect {

    @Before("execution(public * *(..))")
    public void showTime() {
        System.out.println(new Date());
    }
}
