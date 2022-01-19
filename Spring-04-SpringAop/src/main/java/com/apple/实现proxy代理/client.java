package com.apple.实现proxy代理;

import com.apple.service.Service;
import com.apple.service.ServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author Double_apple
 * @Date 2022/1/19 19:38
 * @Version 1.0
 */
public class client {

    public static void main(String[] args) {
        Service target = new ServiceImpl();

        InvocationHandler myhandler = new myselfInvocationHandler(target);

        //使用proxy代理，注意用的是原接口  而不是实现类
        Service proxy = (Service) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), myhandler);

        proxy.doOther();



    }
}
