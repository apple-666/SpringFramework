package com.apple;

/**
 * @Author Double_apple
 * @Date 2022/1/18 23:39
 * @Version 1.0
 */
public class School {
    private  String name;
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