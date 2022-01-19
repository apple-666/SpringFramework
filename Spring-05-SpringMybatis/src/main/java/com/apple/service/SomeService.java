package com.apple.service;

import com.apple.domain.Student;

import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/1/20 0:33
 * @Version 1.0
 */
public interface SomeService {
    List<Student> queryStudent();
    int addStudent(Student student);
}
