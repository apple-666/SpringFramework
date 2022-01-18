package com.apple;

/**
 * @Author Double_apple
 * @Date 2022/1/18 23:40
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;

    //引用类型
    private  School school;

    public Student() {
        System.out.println("Student的无参数构造方法");
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("setSchool:"+school);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
