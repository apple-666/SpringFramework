package com.apple.aspectj框架实现代理.service.impl;

import com.apple.aspectj框架实现代理.service.Sservice;

/**
 * @Author Double_apple
 * @Date 2022/1/19 20:44
 * @Version 1.0
 */
public class SserviceImpl implements Sservice {
    @Override
    public void doSome() {
        System.out.println("sserviceimpl 的doSome方法");
    }
}
