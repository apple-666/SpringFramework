package com.apple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author Double_apple
 * @Date 2022/1/18 23:39
 * @Version 1.0
 */
@Component("school")
public class School {

    @Value("SDJU")
    private  String name;

    @Value("临港")
    private  String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}