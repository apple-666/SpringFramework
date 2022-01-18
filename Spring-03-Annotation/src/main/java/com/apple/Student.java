package com.apple;

import org.springframework.stereotype.Component;

/**
 * @Author Double_apple
 * @Date 2022/1/18 23:40
 * @Version 1.0
 */
//@Component: 创建类的对象，等同于<bean />，默认是单例对象 value 等同于 id
@Component(value = "student")
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
