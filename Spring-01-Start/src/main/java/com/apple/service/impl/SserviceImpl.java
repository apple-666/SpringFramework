package com.apple.service.impl;

import com.apple.service.Sservice;

/**
 * @Author Double_apple
 * @Date 2022/1/18 20:30
 * @Version 1.0
 */
public class SserviceImpl implements Sservice {

    public SserviceImpl() {
        System.out.println("已调用无参构造");
    }

    @Override
    public void doSome() {
        System.out.println("已经接口的方法 ");
    }
}
