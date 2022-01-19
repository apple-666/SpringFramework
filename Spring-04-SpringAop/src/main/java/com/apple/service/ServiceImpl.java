package com.apple.service;

/**
 * @Author Double_apple
 * @Date 2022/1/19 19:16
 * @Version 1.0
 */
public class ServiceImpl implements Service {
    @Override
    public void doSome() {
        System.out.println("apple 执行了 Service 的 doSome");
    }

    @Override
    public void doOther() {
        System.out.println("apple 执行了 Service 的 doOther");
    }
}
