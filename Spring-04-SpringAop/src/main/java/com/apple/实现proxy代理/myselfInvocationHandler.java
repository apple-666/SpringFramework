package com.apple.实现proxy代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author Double_apple
 * @Date 2022/1/19 19:33
 * @Version 1.0
 */
public class myselfInvocationHandler implements InvocationHandler {

    //serviceimpl  目标对象
    private Object target = null;

    public myselfInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行了myselfInvocationHandler中 的 invoke方法");

        Object res = null;
        System.out.println("这里是目标对象 之前 增强的方法");

        res = method.invoke(target, args);//作为 serviceimple的动态代理对象 执行 dosome/doother方法

        System.out.println("这里是目标对象 之后 增强的方法");

        return res;
    }
}
