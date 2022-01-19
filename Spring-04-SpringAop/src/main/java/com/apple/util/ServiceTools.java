package com.apple.util;

import java.util.Date;

/**
 * @Author Double_apple
 * @Date 2022/1/19 20:33
 * @Version 1.0
 */
public class ServiceTools {

    public static void logTime() {
        System.out.println("当前时间：" + new Date());
    }

    public static void doTran(){
        System.out.println("已经提交了事务");
    }
}
